import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class SetterProtectionProxy implements InvocationHandler {
    private Object obj;

    private SetterProtectionProxy(final Object obj) {
        this.obj = obj;
    }

    public static Object newInstance(Object obj) {
        return Proxy.newProxyInstance(
            obj.getClass().getClassLoader(),
            obj.getClass().getInterfaces(),
            new SetterProtectionProxy(obj));
    }

    @Override
    public Object invoke(final Object proxy, final Method method, final Object[] args) throws Throwable {
        Object result;

        if (method.getName().startsWith("set")) {
            throw new IllegalAccessException("Setters are protected.");
        } else {
            result = method.invoke(obj, args);
        }

        return result;
    }
}
