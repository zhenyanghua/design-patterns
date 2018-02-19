public class Application {
    public static void main(String[] args) {

        EndpointFilter endpointFilter = new EndpointFilter();
        SecuredFilter securedFilter = new SecuredFilter();
        AuthorizationHeaderFilter authorizationHeaderFilter = new
            AuthorizationHeaderFilter();
        AuthorizationCheckFilter authorizationCheckFilter = new
            AuthorizationCheckFilter();
        ResourceFilter resourceFilter = new ResourceFilter();

        endpointFilter.setSuccessor(securedFilter);
        securedFilter.setSuccessor(authorizationHeaderFilter);
        authorizationHeaderFilter.setSuccessor(authorizationCheckFilter);
        authorizationCheckFilter.setSuccessor(resourceFilter);

        System.out.println("The following request should be stopped and " +
            "handled at the Endpoint filter");
        Request request = new Request("https://mighty.friends.org/contact",
            null);
        endpointFilter.handleRequest(request);

        System.out.println("The following request should be stopped and " +
            "handled at the Secured filter");
        request = new Request("https://mighty.friends.org/about", null);
        endpointFilter.handleRequest(request);

        System.out.println("The following request should be stopped and " +
            "handled at the Authorization Header filter");
        request = new Request("https://mighty.friends.org/friends", null);
        endpointFilter.handleRequest(request);

        System.out.println("The following request should be stopped and " +
            "handled at the Authorization Check filter");
        request = new Request("https://mighty.friends.org/friends",
            "invalid");
        endpointFilter.handleRequest(request);

        System.out.println("The following request should go through all " +
            "filters and return the resource");
        request = new Request("https://mighty.friends.org/friends",
            "valid");
        endpointFilter.handleRequest(request);
    }
}
