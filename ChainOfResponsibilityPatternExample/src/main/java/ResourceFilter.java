public class ResourceFilter extends RequestFilter {

    @Override
    public void handleRequest(final Request request) {
        System.out.println("Running Resource Filter...");
        System.out.println(Helper.getResource());
    }
}
