package com.example.android.dharwad;

public class Attraction {

    private String mName;
    private Address mAddress;
    private String mType;
    private int mImageResourceId =NO_IMAGE_PROVIDED;



    /** Constant value that represents no image was provided for this attraction*/
    private static final int NO_IMAGE_PROVIDED = -1;


    public Attraction(int image, String name, Address address, String type) {
        this.mName = name;
        this.mAddress = address;
        this.mType = type;
        this.mImageResourceId = image;
    }

    public Attraction(int image,String name, String description) {
        this.mName = name;
        this.mType = description;
        this.mImageResourceId = image;
    }

    public Attraction(String name, Address address, String type) {
        this.mName = name;
        this.mAddress = address;
        this.mType = type;

    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public String getmNameStringId() {
        return mName;
    }

    public Address getmAddressStringId() {
        return mAddress;
    }

    public String getmType() {
        return mType;
    }


}
