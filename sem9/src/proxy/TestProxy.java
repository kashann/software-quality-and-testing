package proxy;

public class TestProxy {

	public static void main(String[] args) {
		IContract proxyContract = new ProxyContract("text");
		
		proxyContract.copyContract();
		proxyContract.copyContract();
		proxyContract.copyContract();
	}

}
