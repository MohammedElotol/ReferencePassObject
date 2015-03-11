package com.example.ahmadlap.referencepassobject;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

public class Food implements Serializable{
    String name;

    public Food(String name) {
        this.name  = name;
    }


}
