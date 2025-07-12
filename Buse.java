package BUS;

 

public class Buse{
private int busno;
private boolean ac;
private int cap;// get and set

 Buse(int busno,boolean ac,int cap) {
	 this.busno=busno;
	 this.ac=ac;
	 this.cap=cap;
}
public  void setAc(boolean ac) {
	this.ac=ac;
}
public boolean getac() {
	return ac;
}
public int getbusno() {
	return busno;
}
public int getcap() {
	return cap;
}
public  void setAc(int cap) {
	this.cap=cap;
}

}