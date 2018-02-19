public class SecuredFilter extends RequestFilter {
    @Override
    public void handleRequest(final Request request) {
        System.out.println("Running Secured Filter...");

        if (!Helper.isSecured(request)) {
            System.out.println(Helper.getResource());
            return;
        }
        successor.handleRequest(request);
    }
}
