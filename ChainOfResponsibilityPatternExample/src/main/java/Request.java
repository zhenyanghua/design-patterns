public class Request {
    private String url;
    private String authorizationHeader;

    public Request(final String url, final String authorizationHeader) {
        this.url = url;
        this.authorizationHeader = authorizationHeader;
    }

    public String getUrl() {
        return url;
    }

    public String getAuthorizationHeader() {
        return authorizationHeader;
    }
}
