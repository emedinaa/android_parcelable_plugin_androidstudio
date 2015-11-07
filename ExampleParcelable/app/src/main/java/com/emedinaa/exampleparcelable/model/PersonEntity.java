package com.emedinaa.exampleparcelable.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by emedinaa on 07/11/15.
 */
public class PersonEntity implements Parcelable {

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.id);
        dest.writeString(this.name);
    }

    public PersonEntity() {
    }

    protected PersonEntity(Parcel in) {
        this.id = in.readInt();
        this.name = in.readString();
    }

    public static final Parcelable.Creator<PersonEntity> CREATOR = new Parcelable.Creator<PersonEntity>() {
        public PersonEntity createFromParcel(Parcel source) {
            return new PersonEntity(source);
        }

        public PersonEntity[] newArray(int size) {
            return new PersonEntity[size];
        }
    };

    @Override
    public String toString() {
        return "PersonEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
