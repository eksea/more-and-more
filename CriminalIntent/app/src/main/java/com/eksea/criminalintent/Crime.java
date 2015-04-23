package com.eksea.criminalintent;

import java.util.UUID;

/**
 * Created by Jack on 2015/4/9.
 */
public class Crime {
    private UUID mId;
    private String mTitle;

    public Crime() {
        mId = UUID.randomUUID();
    }

    public UUID getId() {
        return mId;
    }
}
