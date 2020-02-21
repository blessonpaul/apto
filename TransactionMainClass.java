package apto;

public class TransactionMainClass {

	
	public String getTransactionHexFromRequest(String coin, RecoveryRequest recoveryRequest, String key, Boolean skipConfirm) {
		Coin coinEos = new CoinEos();
		Coin coinErc20 = new CoinErc20();
		Coin coinEthereum = new CoinEthereum();
		Coin coinTrx = new CoinTrx();
		Coin coinUtxo = new CoinUtxo();
		Coin coinXrp = new CoinXrp();
		
		switch(coin) {
			case "eos":
				coinEos.handleSign(recoveryRequest, key, skipConfirm);
				break;
			case "eos20":
				coinErc20.handleSign(recoveryRequest, key, skipConfirm);
				break;
			case "eth":
				coinEthereum.handleSign(recoveryRequest, key, skipConfirm);
				break;
			case "trx":
				coinTrx.handleSign(recoveryRequest, key, skipConfirm);
				break;
			case "utxo":
				coinUtxo.handleSign(recoveryRequest, key, skipConfirm);
				break;
			default:
				coinXrp.handleSign(recoveryRequest, key, skipConfirm);
				break;
				
		}
		
		
		return "";
	}
}
