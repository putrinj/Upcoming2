package com.putrinursofiyanti1605910.upcoming;

import android.os.Parcel;
import android.os.Parcelable;

public class Films implements Parcelable {
    private String name, desc, photo;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public String getPhoto() {
        return photo;
    }
    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.desc);
        dest.writeString(this.photo);
    }

    public Films() {
    }

    protected Films(Parcel in) {
        this.name = in.readString();
        this.desc = in.readString();
        this.photo = in.readString();
    }

    public static final Parcelable.Creator<Films> CREATOR = new Parcelable.Creator<Films>() {
        @Override
        public Films createFromParcel(Parcel source) {
            return new Films(source);
        }

        @Override
        public Films[] newArray(int size) {
            return new Films[size];
        }
    };
}
