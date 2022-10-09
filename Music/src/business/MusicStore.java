package business;

import java.util.Calendar;

public class MusicStore {
    
    private String owner;
    private int openTime;
    private int closeTime;
    
    public MusicStore(String owner, int openTime, int closeTime) {
        this.owner = owner;
        this.openTime = openTime;
        this.closeTime = closeTime;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getOpenTime() {
        return openTime;
    }

    public void setOpenTime(int openTime) {
        this.openTime = openTime;
    }

    public int getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(int closeTime) {
        this.closeTime = closeTime;
    }

    public boolean isOpen(){
        int currentHour = this.getHourInt();
        if((this.getOpenTime() < currentHour) && (this.getCloseTime() > currentHour)){
            return true;
        }else{
            return false;
        }
    }

    private int getHourInt() {
        Calendar c = Calendar.getInstance(); 
		return c.get(Calendar.HOUR_OF_DAY);
    }

    public String getOpenClosedMessage() {
		if(this.isOpen()) {
			return "Estamos Abertos"; 
		}
		return "Estamos Fechados";
	}

    public void displayHoursOfOperation() {
		System.out.println("Período: ");
		System.out.println("Diariamente das "+this.getOpenTime()+":00 as "+this.getCloseTime()+":00");
		System.out.println(this.owner +" ,Proprietário ");
	}

    @Override
    public String toString() {
		return "MusicStore [owner=" + owner + ", openTime=" + openTime + ", closeTime=" + closeTime + "]";
	}
}
