package com.amigoscode.awsimageupload.bucket;

public enum BucketName {

    PROFILE_IMAGE("profile-pictures-meme"); // your bucket name on amazon aws

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
