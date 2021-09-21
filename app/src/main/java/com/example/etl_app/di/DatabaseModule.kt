package com.example.etl_app.di

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.CollectionReference
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.ktx.Firebase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(): FirebaseFirestore{
        return FirebaseFirestore.getInstance()
    }

    @Singleton
    @Provides
    @Named("usersCollection")
    fun provideUsersCollection(db: FirebaseFirestore): CollectionReference{
        return db.collection("users")
    }

    @Provides
    @Named("productsCollection")
    fun provideProductsCollection(db: FirebaseFirestore): CollectionReference{
        return db.collection("products")
    }

    @Provides
    @Named("ordersCollection")
    fun provideOrdersCollection(db: FirebaseFirestore): CollectionReference{
        return db.collection("orders")
    }

    @Provides
    @Named("shopsCollection")
    fun provideShopsCollection(db: FirebaseFirestore): CollectionReference{
        return db.collection("shops")
    }

    @Provides
    @Named("ownersCollection")
    fun provideShopOwnersCollection(db: FirebaseFirestore): CollectionReference{
        return db.collection("owners")
    }

    @Provides
    @Named("currentUserId")
    fun provideCurrentUserId(): String {
        return Firebase.auth.currentUser!!.uid
    }
}