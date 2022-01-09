package com.example.etl_app.data.daos

import com.example.etl_app.data.models.User
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.CollectionReference
import com.google.firebase.firestore.DocumentSnapshot
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.tasks.await
import javax.inject.Inject
import javax.inject.Named

class UserDao @Inject constructor(
    @Named("currentUserId") private val currentUserId: String,
    @Named("usersCollection") private val usersCollection: CollectionReference
){

    fun getUserById(uid: String): Task<DocumentSnapshot>{
        return usersCollection.document(uid).get()
    }

    fun addUser(user: User?){
        user?.let {
            //do this work in background thread
            CoroutineScope(Dispatchers.IO).launch {
                usersCollection.document(user.userId).set(it)
            }
        }
    }

    fun updateProfile(changedUser: User?){
        //do this work on background thread
        CoroutineScope(Dispatchers.IO).launch {
            usersCollection.document(changedUser?.userId!!).set(changedUser)
        }
    }
}