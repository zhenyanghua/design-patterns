public class EndpointFilter extends RequestFilter {
    @Override
    public void handleRequest(final Request request) {
        System.out.println("Running Endpoint Filter...");

        if (!Helper.matchUrl(request)) {
            System.out.println("Not Found");
            return;
        }
        successor.handleRequest(request);
    }
}
