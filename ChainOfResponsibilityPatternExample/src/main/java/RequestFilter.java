public abstract class RequestFilter implements Filter {
    protected RequestFilter successor;

    public void setSuccessor(RequestFilter successor) {
        this.successor = successor;
    }

    @Override
    public abstract void handleRequest(final Request request);
}
