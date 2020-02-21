package apto;

public abstract class Coin {

	public String handleSign(RecoveryRequest recoveryRequest, String key, Boolean skipConfirm) {

		String txHex = getTransactionHexFromRequest(recoveryRequest);

		confirmRecovery(recoveryRequest, getOutput(txHex, recoveryRequest), getCustomMessage(recoveryRequest),
				skipConfirm);

		if (null == key) {
			System.out.println("Please enter the xprv of the wallet for signing: ");
		}
		
		getHDNodeAndVerify(key, recoveryRequest);
		
		return processKey(key, recoveryRequest, getHDNodeAndVerify(key, recoveryRequest));

	}

	private String getTransactionHexFromRequest(RecoveryRequest recoveryRequest) {
		return "";
	}

	private void confirmRecovery(RecoveryRequest recoveryRequest, Output output, String customMessage,
			Boolean skipConfirm) {

	}
	
	private String getHDNodeAndVerify(String key, RecoveryRequest recoveryRequest) {
		return "";
	}

	protected abstract Output getOutput(String txHex, RecoveryRequest recoveryRequest);

	protected abstract String getCustomMessage(RecoveryRequest recoveryRequest);
	
	protected abstract String processKey(String key, RecoveryRequest recoveryRequest, String backupKey);

}
