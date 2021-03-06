package group.six.projects.fitbuddy.fragments

import android.media.Image
import com.parse.ParseClassName
import com.parse.ParseFile
import com.parse.ParseObject
import com.parse.ParseUser
import java.time.format.DateTimeFormatter
import java.util.*

// description : String
// Image : File
// user : User
// createdAt : Date
@ParseClassName("Post")
class Post : ParseObject() {

    fun getDescription (): String?{
        return getString(KEY_DESCRIPTION)
    }
    fun setDescription(description: String){
        put(KEY_DESCRIPTION, description)
    }
    fun getImage(): ParseFile? {
        return getParseFile(KEY_IMAGE)
    }
    fun setImage (parseFile: ParseFile){
        put(KEY_IMAGE, parseFile)
    }
    fun getUser (): ParseUser? {
        return getParseUser(KEY_USER)
    }
    fun setUser(parseUser: ParseUser){
        put(KEY_USER, parseUser)
    }
    fun getTime (): Date? {
        return getCreatedAt()
    }
//    fun setTime (createdAt : Date){
//        put(KEY_TIME, createdAt)
//    }


    companion object{
        const val KEY_DESCRIPTION = "description"
        const val KEY_IMAGE = "Image"
        const val KEY_USER = "user"
        const val KEY_TIME = "createdAt"
    }
}