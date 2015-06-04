package company;

public class LGTV extends Tv {

	@Override
	public void channelUp() {
		channelNum = channelNum + 2;
	}

	@Override
	public void channelDown() {
		channelNum = channelNum - 2;
	}

}
