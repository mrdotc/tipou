package snowgame.living;

import java.math.BigDecimal;

public class Action {

	private BigDecimal rightLen;
	private BigDecimal leftLen;
	public BigDecimal getRightLen() {
		return rightLen;
	}
	public void setRightLen(BigDecimal rightLen) {
		this.rightLen = rightLen;
	}
	public BigDecimal getLeftLen() {
		return leftLen;
	}
	public void setLeftLen(BigDecimal leftLen) {
		this.leftLen = leftLen;
	}
	public BigDecimal getForwardLen() {
		return forwardLen;
	}
	public void setForwardLen(BigDecimal forwardLen) {
		this.forwardLen = forwardLen;
	}
	public BigDecimal getBackLen() {
		return backLen;
	}
	public void setBackLen(BigDecimal backLen) {
		this.backLen = backLen;
	}
	private BigDecimal forwardLen;
	private BigDecimal backLen;
	
}
