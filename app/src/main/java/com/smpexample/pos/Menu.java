package com.smpexample.pos;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Menu {

        long mNow = System.currentTimeMillis();
        Date mReDate = new Date(mNow);
        SimpleDateFormat mFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formatDate = mFormat.format(mReDate);


    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    private String nickname;


        public String getFormatDate() {
            return formatDate;
        }

        public void setFormatDate(String formatDate) {
            this.formatDate = formatDate;
        }




        public String getDetails() {
            return details;
        }

        public void setDetails(String details) {
            this.details = details;
        }

        public String getDrink() {
            return drink;
        }

        public void setDrink(String drink) {
            this.drink = drink;
        }

        private  String details;
        private String drink;

        public Menu(){
        }


        public Menu(String nickname,String drink,String details,String formatDate){
           this.nickname = nickname;
            this.details = details;
            this.drink = drink;
            this.formatDate = formatDate;



        }

    }


