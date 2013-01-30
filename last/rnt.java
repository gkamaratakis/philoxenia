
public class rnt {
int id;
String doa;
String dod;
float price;
String rname;
String cname;
boolean paid;
String status;
public rnt(String doa,String dod,String cname,String rname,float price){
	this.doa=doa;
	this.dod=dod;
	this.cname=cname;
	this.rname=rname;
	this.price=price;
	paid=false;
	status="available";	
	}
public void pay(){
paid=true;	
}
public void reserve(){
	status="Reserved";
}
public void checkout(){
	status="n/a";
	}
public void checkin(){
	status="Occupied";	
}
public void register(){
	//grapse sthnn db thn kratisi
}
}
