import java.util.HashMap;
import java.util.Map;

public class Helper {
    private Helper() {
        throw new AssertionError();
    }
    private static Map<String, Boolean> url;

    static {
        url = new HashMap<>();
        url.put("https://mighty.friends.org/friends", true);
        url.put("https://mighty.friends.org/about", false);
    }

    public static boolean matchUrl(Request request) {
        return url.containsKey(request.getUrl());
    }

    public static boolean isSecured(Request request) {
        return url.get(request.getUrl());
    }

    public static boolean Authorize(Request request) {
        return request.getAuthorizationHeader().equals("valid");
    }

    public static String getResource() {
        return "Mighty Friends";
    }
}
