package couplegoals.com.couplegoals.database;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.util.List;

import couplegoals.com.couplegoals.model.Category;

/**
 * Created by Brijesh on 8/7/2017.
 */

public class DatabaseValues {

    public static String COUPLENAME;
    public static String YOURNAME;
    public static String PARTNERNAME;
    public static String PROFILE_PICTURE_PATH;
    public static String YOURDISPLAYNAME;
    public static String YOURMAILID;
    public static String PARTNERMAILID;


    public static String getYOURDISPLAYNAME() {
        return YOURDISPLAYNAME;
    }

    public static void setYOURDISPLAYNAME(String YOURDISPLAYNAME) {
        DatabaseValues.YOURDISPLAYNAME = YOURDISPLAYNAME;
    }

    public static String getPARTNERDISPLAYNAME() {
        return PARTNERDISPLAYNAME;
    }

    public static void setPARTNERDISPLAYNAME(String PARTNERDISPLAYNAME) {
        DatabaseValues.PARTNERDISPLAYNAME = PARTNERDISPLAYNAME;
    }

    public static String PARTNERDISPLAYNAME;
    public static List<Category> CATEGORY_LIST;

    public static List<Category> getCategoryList() {
        return CATEGORY_LIST;
    }

    public static void setCategoryList(List<Category> categoryList) {
        CATEGORY_LIST = categoryList;
    }
    public static String getCOUPLENAME() {
        return COUPLENAME;
    }

    public static String getYOURNAME() {
        return YOURNAME;
    }

    public static void setYOURNAME(String YOURNAME) {
        DatabaseValues.YOURNAME = YOURNAME;
    }

    public static String getPARTNERNAME() {
        return PARTNERNAME;
    }

    public static void setPARTNERNAME(String PARTNERNAME) {
        DatabaseValues.PARTNERNAME = PARTNERNAME;
    }

    public static String getProfilePicturePath() {
        return PROFILE_PICTURE_PATH;
    }

    public static void setProfilePicturePath(String profilePicturePath) {
        PROFILE_PICTURE_PATH = profilePicturePath;
    }

    public static void setCOUPLENAME(String COUPLENAME) {
        DatabaseValues.COUPLENAME = COUPLENAME;
    }

    public static String getUserLoginId(){

        return FirebaseAuth.getInstance().getCurrentUser().getEmail();
    }
    public static String getUserDisplayName(){

        return FirebaseAuth.getInstance().getCurrentUser().getDisplayName();
    }

    //get UniqueUserId

    public static String getUserUniqueId(){
        return FirebaseAuth.getInstance().getCurrentUser().getUid();
    }

    public static DatabaseReference getCoupleDetailReference(){
        DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference("CoupleDetails");
        return databaseReference;
    }
    public static DatabaseReference getExpseDetailReference(){
        DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference("ExpenseDetails");
        return databaseReference;
    }
    public static DatabaseReference getPostDetailReference(){
        DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference("PostDetails");
        return databaseReference;
    }
    public static DatabaseReference getExpensePersonalDetailReference(){
        DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference("ExpensePersonalDetails");
        return databaseReference;
    }
    public static DatabaseReference getCategoryReference(){
        DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference("Category");
        return databaseReference;
    }
    public static FirebaseAuth getFrirebaseInstance(){
        return FirebaseAuth.getInstance();
    }
    public static StorageReference getStorageReference(){
        return FirebaseStorage.getInstance().getReference();
    }

    public static String getYOURMAILID() {
        return YOURMAILID;
    }

    public static void setYOURMAILID(String YOURMAILID) {
        DatabaseValues.YOURMAILID = YOURMAILID;
    }

    public static String getPARTNERMAILID() {
        return PARTNERMAILID;
    }

    public static void setPARTNERMAILID(String PARTNERMAILID) {
        DatabaseValues.PARTNERMAILID = PARTNERMAILID;
    }
}
