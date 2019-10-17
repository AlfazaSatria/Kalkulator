package com.example.kalkulator.util;

import android.os.Parcel;
import android.os.Parcelable;

public class FeedbackClass implements Parcelable {

    private String feedback, nama;
    private int umur;

    public String getNama() { return nama; }
    public int getUmur() { return umur; }
    public String getFeedback() { return feedback; }

    public FeedbackClass(String feedback, String nama, int umur) {
        this.feedback =feedback;
        this.nama =nama;
        this.umur =umur;

    }


    protected FeedbackClass(Parcel in) {
        feedback= in.readString();
        nama = in.readString();
        umur=in.readInt();
    }

    public static final Creator<FeedbackClass> CREATOR = new Creator<FeedbackClass>() {
        @Override
        public FeedbackClass createFromParcel(Parcel in) {
            return new FeedbackClass(in);
        }

        @Override
        public FeedbackClass[] newArray(int size) {
            return new FeedbackClass[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(nama);
        parcel.writeString(feedback);
        parcel.writeInt(umur);
    }
}
