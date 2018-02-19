public class AuthorizationHeaderFilter extends RequestFilter {
    @Override
    public void handleRequest(final Request request) {
        System.out.println("Running Authorization Header Filter...");

        if (request.getAuthorizationHeader() == null) {
            System.out.println("Unauthorized Request");
            return;
        }
        successor.handleRequest(request);
    }
}
