public class AuthorizationCheckFilter extends RequestFilter {
    @Override
    public void handleRequest(final Request request) {
        System.out.println("Running Authorization Check Filter...");

        if (!Helper.Authorize(request)) {
            System.out.println("Invalid credential");
            return;
        }
        successor.handleRequest(request);
    }
}
