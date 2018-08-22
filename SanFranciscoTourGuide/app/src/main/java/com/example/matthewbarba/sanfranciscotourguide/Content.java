package com.example.matthewbarba.sanfranciscotourguide;

public class Content {

    //    Name of the Location
    private String mLocation;

    //    Address of the Location
    private String mAddress;

    //    Phone # of the Location
    private String mPhoneNumber;

    //    Web Address of the Location
    private String mWebAddress;

    //    Image of the Location
    private int mImageResourceID;

//    Create a new Content Object.
//    @param location is the name of the location
//    @param address is the address of the location
//    @param phoneNumber is the phone number of the location
//    @param webAddress is the URL of the location
//    @param imageResourceID is the image of the location

    public Content(String location, String address, String phoneNumber,
                   String webAddress, int imageResourceID) {
        mLocation = location;
        mAddress = address;
        mPhoneNumber = phoneNumber;
        mWebAddress = webAddress;
        mImageResourceID = imageResourceID;
    }

    /**
     * Create a new Content Object use for objects under the districts activity.
     * these locations do not necessarily have an exact address, or
     * phone numberwhich is why these parameters have been excluded.
     *
     * @param location        is the address of the location
     * @param webAddress      is the Url of the location
     * @param imageResourceID is the image associated with the location
     */
    public Content(String location, String webAddress, int imageResourceID) {
        mLocation = location;
        mWebAddress = webAddress;
        mImageResourceID = imageResourceID;
    }

    //    get the location
    public String getLocation() {
        return mLocation;
    }

    //    get the address
    public String getAddress() {
        return mAddress;
    }

    //    get the Phone Number
    public String getPhoneNumber() {
        return mPhoneNumber;
    }

    //    get the URL
    public String getWebAddress() {
        return mWebAddress;
    }

    //    get the Image associated with the location
    public int getImageResourceID() {
        return mImageResourceID;
    }

}
