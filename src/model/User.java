package model;
import java.util.Date;
import java.util.Calendar;

public abstract class User{

    private String nickname;
    private String cc;
    private Date bondingDate;
    private Calendar calendar;

    public User(String nickname, String cc){
        this.nickname = nickname;
        this.cc = cc;
        this.calendar = Calendar.getInstance();
        this.bondingDate = calendar.getTime();
    }

    public String getNickname(){
        return nickname;
    }

    public void setNickname(String nickname){
        this.nickname = nickname;
    }

    public String getCC(){
        return cc;
    }

    public void setCC(String cc){
        this.cc = cc;
    }

    public String getBondingDate(){
		return this.bondingDate.toString();
	}
}