package com.deneme.mobillproje

import android.content.ContentValues
import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.util.Log
import android.widget.Button
import android.widget.ImageButton
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_sixteen_cards.*
import kotlinx.android.synthetic.main.activity_thirty_six_cards.*
import java.util.concurrent.TimeUnit

class ThirtySixCardsActivity : AppCompatActivity() {

    var true_count :Int =0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thirty_six_cards)


        var intent = Intent(this, MainActivity::class.java)
        val shocked_music = MediaPlayer.create(this, R.raw.shocked)
        val prologue_music = MediaPlayer.create(this, R.raw.prologue)
        prologue_music.start()


        object: CountDownTimer(45000,1000){  // "CountDownTimer"(Sayaç) abstract classdan olduğu için bu şekil tanımlandı(1.parametre kaç milisaniye süreceğini,2.parametre kaç milisaniye de bir azalacağını gösterir)
            override fun onTick(p0: Long) {
                Time_Thirty_Six_Cards_Game.text="Kalan:${p0/1000} sn" // p0 kalan değeri gösterir her azalmada "onTick()" methoduna girer
            }

            override fun onFinish() {		// "onFinish()" methodunda sayacın bittiği yerdir
                Time_Thirty_Six_Cards_Game.text="Kalan:0 sn"


                if(true_count!=18){      // Oyunu bitiremediği zaman

                    prologue_music.pause()
                    shocked_music.start()

                    startActivity(intent)

                }
                else{

                    prologue_music.pause()


                }
            }


        }.start()


        var thirty_six_cards_stop_music_button: Button =findViewById(R.id.Thirty_Six_Cards_Stop_Music)

        thirty_six_cards_stop_music_button.setOnClickListener {

            prologue_music.pause()

        }


        var urlList=arrayListOf<String>()
        var buttonIdList=arrayListOf<ImageButton>()


        var k : Int=0

        var rImage : ImageButton =findViewById(R.id.ImageT)
        var rImage1 : ImageButton =findViewById(R.id.ImageT1)
        var rImage2 : ImageButton =findViewById(R.id.ImageT2)
        var rImage3: ImageButton =findViewById(R.id.ImageT3)
        var rImage4 : ImageButton =findViewById(R.id.ImageT4)
        var rImage5 : ImageButton =findViewById(R.id.ImageT5)
        var rImage6 : ImageButton =findViewById(R.id.ImageT6)
        var rImage7 : ImageButton =findViewById(R.id.ImageT7)
        var rImage8: ImageButton =findViewById(R.id.ImageT8)
        var rImage9: ImageButton =findViewById(R.id.ImageT9)
        var rImage10: ImageButton =findViewById(R.id.ImageT10)
        var rImage11: ImageButton =findViewById(R.id.ImageT11)
        var rImage12 : ImageButton =findViewById(R.id.ImageT12)
        var rImage13 : ImageButton =findViewById(R.id.ImageT13)
        var rImage14 : ImageButton =findViewById(R.id.ImageT14)
        var rImage15 : ImageButton =findViewById(R.id.ImageT15)
        var rImage16 : ImageButton =findViewById(R.id.ImageT16)
        var rImage17 : ImageButton =findViewById(R.id.ImageT17)
        var rImage18 : ImageButton =findViewById(R.id.ImageT18)
        var rImage19 : ImageButton =findViewById(R.id.ImageT19)
        var rImage20 : ImageButton =findViewById(R.id.ImageT20)
        var rImage21 : ImageButton =findViewById(R.id.ImageT21)
        var rImage22 : ImageButton =findViewById(R.id.ImageT22)
        var rImage23 : ImageButton =findViewById(R.id.ImageT23)
        var rImage24 : ImageButton =findViewById(R.id.ImageT24)
        var rImage25 : ImageButton =findViewById(R.id.ImageT25)
        var rImage26 : ImageButton =findViewById(R.id.ImageT26)
        var rImage27: ImageButton =findViewById(R.id.ImageT27)
        var rImage28 : ImageButton =findViewById(R.id.ImageT28)
        var rImage29 : ImageButton =findViewById(R.id.ImageT29)
        var rImage30: ImageButton =findViewById(R.id.ImageT30)
        var rImage31 : ImageButton =findViewById(R.id.ImageT31)
        var rImage32: ImageButton =findViewById(R.id.ImageT32)
        var rImage33 : ImageButton =findViewById(R.id.ImageT33)
        var rImage34 : ImageButton =findViewById(R.id.ImageT34)
        var rImage35 : ImageButton =findViewById(R.id.ImageT35)


        var firebaseDatabase = FirebaseDatabase.getInstance()

        var databaseReference = firebaseDatabase.reference


        var getImage = databaseReference.child("image/p")
        var getImage1 = databaseReference.child("image/p")
        var getImage2 = databaseReference.child("image/p")
        var getImage3 = databaseReference.child("image/p")
        var getImage4 = databaseReference.child("image/p")
        var getImage5 = databaseReference.child("image/p")
        var getImage6 = databaseReference.child("image/p")
        var getImage7 = databaseReference.child("image/p")
        var getImage8 = databaseReference.child("image/p")
        var getImage9 = databaseReference.child("image/p")
        var getImage10 = databaseReference.child("image/p")
        var getImage11= databaseReference.child("image/p")
        var getImage12 = databaseReference.child("image/p")
        var getImage13 = databaseReference.child("image/p")
        var getImage14= databaseReference.child("image/p")
        var getImage15= databaseReference.child("image/p")
        var getImage16 = databaseReference.child("image/p")
        var getImage17 = databaseReference.child("image/p")
        var getImage18 = databaseReference.child("image/p")
        var getImage19 = databaseReference.child("image/p")
        var getImage20 = databaseReference.child("image/p")
        var getImage21= databaseReference.child("image/p")
        var getImage22 = databaseReference.child("image/p")
        var getImage23 = databaseReference.child("image/p")
        var getImage24 = databaseReference.child("image/p")
        var getImage25 = databaseReference.child("image/p")
        var getImage26 = databaseReference.child("image/p")
        var getImage27= databaseReference.child("image/p")
        var getImage28 = databaseReference.child("image/p")
        var getImage29 = databaseReference.child("image/p")
        var getImage30= databaseReference.child("image/p")
        var getImage31= databaseReference.child("image/p")
        var getImage32 = databaseReference.child("image/p")
        var getImage33 = databaseReference.child("image/p")
        var getImage34= databaseReference.child("image/p")
        var getImage35= databaseReference.child("image/p")

        getImage .addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot){
                val link = dataSnapshot.getValue(
                    String::class.java
                )

                Picasso.get().load(link).into(rImage);

            }
            override fun onCancelled(error: DatabaseError) {
                // Failed to read value
                Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı",error.toException())
            }
        })

        getImage1 .addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot){
                val link = dataSnapshot.getValue(
                    String::class.java
                )

                Picasso.get().load(link).into(rImage1);

            }
            override fun onCancelled(error: DatabaseError) {
                // Failed to read value
                Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı",error.toException())
            }
        })

        getImage2 .addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot){
                val link = dataSnapshot.getValue(
                    String::class.java
                )

                Picasso.get().load(link).into(rImage2);

            }
            override fun onCancelled(error: DatabaseError) {
                // Failed to read value
                Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı",error.toException())
            }
        })

        getImage3 .addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot){
                val link = dataSnapshot.getValue(
                    String::class.java
                )

                Picasso.get().load(link).into(rImage3);

            }
            override fun onCancelled(error: DatabaseError) {
                // Failed to read value
                Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı",error.toException())
            }
        })

        getImage4 .addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot){
                val link = dataSnapshot.getValue(
                    String::class.java
                )

                Picasso.get().load(link).into(rImage4);

            }
            override fun onCancelled(error: DatabaseError) {
                // Failed to read value
                Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı",error.toException())
            }
        })

        getImage5 .addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot){
                val link = dataSnapshot.getValue(
                    String::class.java
                )

                Picasso.get().load(link).into(rImage5);

            }
            override fun onCancelled(error: DatabaseError) {
                // Failed to read value
                Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı",error.toException())
            }
        })

        getImage6 .addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot){
                val link = dataSnapshot.getValue(
                    String::class.java
                )

                Picasso.get().load(link).into(rImage6);

            }
            override fun onCancelled(error: DatabaseError) {
                // Failed to read value
                Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı",error.toException())
            }
        })

        getImage7 .addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot){
                val link = dataSnapshot.getValue(
                    String::class.java
                )

                Picasso.get().load(link).into(rImage7);

            }
            override fun onCancelled(error: DatabaseError) {
                // Failed to read value
                Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı",error.toException())
            }
        })

        getImage8 .addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot){
                val link = dataSnapshot.getValue(
                    String::class.java
                )

                Picasso.get().load(link).into(rImage8);

            }
            override fun onCancelled(error: DatabaseError) {
                // Failed to read value
                Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı",error.toException())
            }
        })

        getImage9 .addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot){
                val link = dataSnapshot.getValue(
                    String::class.java
                )

                Picasso.get().load(link).into(rImage9);

            }
            override fun onCancelled(error: DatabaseError) {
                // Failed to read value
                Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı",error.toException())
            }
        })

        getImage10 .addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot){
                val link = dataSnapshot.getValue(
                    String::class.java
                )

                Picasso.get().load(link).into(rImage10);

            }
            override fun onCancelled(error: DatabaseError) {
                // Failed to read value
                Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı",error.toException())
            }
        })

        getImage11 .addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot){
                val link = dataSnapshot.getValue(
                    String::class.java
                )

                Picasso.get().load(link).into(rImage11);

            }
            override fun onCancelled(error: DatabaseError) {
                // Failed to read value
                Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı",error.toException())
            }
        })

        getImage12 .addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot){
                val link = dataSnapshot.getValue(
                    String::class.java
                )

                Picasso.get().load(link).into(rImage12);

            }
            override fun onCancelled(error: DatabaseError) {
                // Failed to read value
                Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı",error.toException())
            }
        })

        getImage13 .addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot){
                val link = dataSnapshot.getValue(
                    String::class.java
                )

                Picasso.get().load(link).into(rImage13);

            }
            override fun onCancelled(error: DatabaseError) {
                // Failed to read value
                Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı",error.toException())
            }
        })

        getImage14 .addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot){
                val link = dataSnapshot.getValue(
                    String::class.java
                )

                Picasso.get().load(link).into(rImage14);

            }
            override fun onCancelled(error: DatabaseError) {
                // Failed to read value
                Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı",error.toException())
            }
        })

        getImage15 .addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot){
                val link = dataSnapshot.getValue(
                    String::class.java
                )

                Picasso.get().load(link).into(rImage15);

            }
            override fun onCancelled(error: DatabaseError) {
                // Failed to read value
                Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı",error.toException())
            }
        })

        getImage16 .addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot){
                val link = dataSnapshot.getValue(
                    String::class.java
                )

                Picasso.get().load(link).into(rImage16);

            }
            override fun onCancelled(error: DatabaseError) {
                // Failed to read value
                Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı",error.toException())
            }
        })

        getImage17 .addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot){
                val link = dataSnapshot.getValue(
                    String::class.java
                )

                Picasso.get().load(link).into(rImage17);

            }
            override fun onCancelled(error: DatabaseError) {
                // Failed to read value
                Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı",error.toException())
            }
        })

        getImage18 .addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot){
                val link = dataSnapshot.getValue(
                    String::class.java
                )

                Picasso.get().load(link).into(rImage18);

            }
            override fun onCancelled(error: DatabaseError) {
                // Failed to read value
                Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı",error.toException())
            }
        })

        getImage19 .addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot){
                val link = dataSnapshot.getValue(
                    String::class.java
                )

                Picasso.get().load(link).into(rImage19);

            }
            override fun onCancelled(error: DatabaseError) {
                // Failed to read value
                Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı",error.toException())
            }
        })

        getImage20 .addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot){
                val link = dataSnapshot.getValue(
                    String::class.java
                )

                Picasso.get().load(link).into(rImage20);

            }
            override fun onCancelled(error: DatabaseError) {
                // Failed to read value
                Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı",error.toException())
            }
        })

        getImage21 .addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot){
                val link = dataSnapshot.getValue(
                    String::class.java
                )

                Picasso.get().load(link).into(rImage21);

            }
            override fun onCancelled(error: DatabaseError) {
                // Failed to read value
                Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı",error.toException())
            }
        })

        getImage22 .addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot){
                val link = dataSnapshot.getValue(
                    String::class.java
                )

                Picasso.get().load(link).into(rImage22);

            }
            override fun onCancelled(error: DatabaseError) {
                // Failed to read value
                Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı",error.toException())
            }
        })

        getImage23 .addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot){
                val link = dataSnapshot.getValue(
                    String::class.java
                )

                Picasso.get().load(link).into(rImage23);

            }
            override fun onCancelled(error: DatabaseError) {
                // Failed to read value
                Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı",error.toException())
            }
        })

        getImage24 .addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot){
                val link = dataSnapshot.getValue(
                    String::class.java
                )

                Picasso.get().load(link).into(rImage24);

            }
            override fun onCancelled(error: DatabaseError) {
                // Failed to read value
                Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı",error.toException())
            }
        })

        getImage25 .addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot){
                val link = dataSnapshot.getValue(
                    String::class.java
                )

                Picasso.get().load(link).into(rImage25);

            }
            override fun onCancelled(error: DatabaseError) {
                // Failed to read value
                Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı",error.toException())
            }
        })

        getImage26 .addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot){
                val link = dataSnapshot.getValue(
                    String::class.java
                )

                Picasso.get().load(link).into(rImage26);

            }
            override fun onCancelled(error: DatabaseError) {
                // Failed to read value
                Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı",error.toException())
            }
        })

        getImage27 .addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot){
                val link = dataSnapshot.getValue(
                    String::class.java
                )

                Picasso.get().load(link).into(rImage27);

            }
            override fun onCancelled(error: DatabaseError) {
                // Failed to read value
                Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı",error.toException())
            }
        })

        getImage28 .addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot){
                val link = dataSnapshot.getValue(
                    String::class.java
                )

                Picasso.get().load(link).into(rImage28);

            }
            override fun onCancelled(error: DatabaseError) {
                // Failed to read value
                Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı",error.toException())
            }
        })

        getImage29 .addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot){
                val link = dataSnapshot.getValue(
                    String::class.java
                )

                Picasso.get().load(link).into(rImage29);

            }
            override fun onCancelled(error: DatabaseError) {
                // Failed to read value
                Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı",error.toException())
            }
        })

        getImage30 .addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot){
                val link = dataSnapshot.getValue(
                    String::class.java
                )

                Picasso.get().load(link).into(rImage30);

            }
            override fun onCancelled(error: DatabaseError) {
                // Failed to read value
                Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı",error.toException())
            }
        })

        getImage31 .addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot){
                val link = dataSnapshot.getValue(
                    String::class.java
                )

                Picasso.get().load(link).into(rImage31);

            }
            override fun onCancelled(error: DatabaseError) {
                // Failed to read value
                Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı",error.toException())
            }
        })

        getImage32 .addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot){
                val link = dataSnapshot.getValue(
                    String::class.java
                )

                Picasso.get().load(link).into(rImage32);

            }
            override fun onCancelled(error: DatabaseError) {
                // Failed to read value
                Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı",error.toException())
            }
        })

        getImage33 .addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot){
                val link = dataSnapshot.getValue(
                    String::class.java
                )

                Picasso.get().load(link).into(rImage33);

            }
            override fun onCancelled(error: DatabaseError) {
                // Failed to read value
                Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı",error.toException())
            }
        })

        getImage34 .addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot){
                val link = dataSnapshot.getValue(
                    String::class.java
                )

                Picasso.get().load(link).into(rImage34);

            }
            override fun onCancelled(error: DatabaseError) {
                // Failed to read value
                Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı",error.toException())
            }
        })

        getImage35 .addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot){
                val link = dataSnapshot.getValue(
                    String::class.java
                )

                Picasso.get().load(link).into(rImage35);

            }
            override fun onCancelled(error: DatabaseError) {
                // Failed to read value
                Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı",error.toException())
            }
        })

        var getImageT1 = databaseReference.child("image/p25")

        var image_button1: ImageButton =findViewById(R.id.ImageT)

        image_button1.setOnClickListener {

            getImageT1 .addValueEventListener(object : ValueEventListener {
                override fun onDataChange(dataSnapshot: DataSnapshot) {
                    val link = dataSnapshot.getValue(
                        String::class.java
                    )

                    if (link != null) {
                        urlList.add(link)
                    }


                    buttonIdList.add(image_button1)
                    k++



                    Picasso.get().load(link).into(rImage);
                    if ((k % 2) - 1 == 0 && k != 1) {
                        Controller(urlList, k, buttonIdList)

                    }


                }
                override fun onCancelled(error: DatabaseError) {
                    // Failed to read value
                    Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı",error.toException())
                }
            })

        }

                var getImageT2 = databaseReference.child("image/p24")

                var image_button2: ImageButton =findViewById(R.id.ImageT1)

                image_button2.setOnClickListener {

                    getImageT2.addValueEventListener(object : ValueEventListener {
                        override fun onDataChange(dataSnapshot: DataSnapshot) {
                            val link = dataSnapshot.getValue(
                                String::class.java
                            )

                            if (link != null) {
                                urlList.add(link)
                            }


                            buttonIdList.add(image_button2)
                            k++



                            Picasso.get().load(link).into(rImage1);
                            if ((k % 2) - 1 == 0 && k != 1) {
                                Controller(urlList, k, buttonIdList)

                            }


                        }
                        override fun onCancelled(error: DatabaseError) {
                            // Failed to read value
                            Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı",error.toException())
                        }
                    })
                }

        var getImageT3 = databaseReference.child("image/p25")

        var image_button3: ImageButton =findViewById(R.id.ImageT2)

        image_button3.setOnClickListener {

            getImageT3.addValueEventListener(object : ValueEventListener {
                override fun onDataChange(dataSnapshot: DataSnapshot) {
                    val link = dataSnapshot.getValue(
                        String::class.java
                    )

                    if (link != null) {
                        urlList.add(link)
                    }


                    buttonIdList.add(image_button3)
                    k++



                    Picasso.get().load(link).into(rImage2);
                    if ((k % 2) - 1 == 0 && k != 1) {
                        Controller(urlList, k, buttonIdList)

                    }


                }
                override fun onCancelled(error: DatabaseError) {
                    // Failed to read value
                    Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı",error.toException())
                }
            })
        }
        var getImageT4 = databaseReference.child("image/p24")

        var image_button4: ImageButton =findViewById(R.id.ImageT3)

        image_button4.setOnClickListener {

            getImageT4.addValueEventListener(object : ValueEventListener {
                override fun onDataChange(dataSnapshot: DataSnapshot) {
                    val link = dataSnapshot.getValue(
                        String::class.java
                    )

                    if (link != null) {
                        urlList.add(link)
                    }


                    buttonIdList.add(image_button4)
                    k++



                    Picasso.get().load(link).into(rImage3);
                    if ((k % 2) - 1 == 0 && k != 1) {
                        Controller(urlList, k, buttonIdList)

                    }


                }
                override fun onCancelled(error: DatabaseError) {
                    // Failed to read value
                    Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı",error.toException())
                }
            })
        }
        var getImageT5 = databaseReference.child("image/p23")

        var image_button5: ImageButton =findViewById(R.id.ImageT4)

        image_button5.setOnClickListener {

            getImageT5.addValueEventListener(object : ValueEventListener {
                override fun onDataChange(dataSnapshot: DataSnapshot) {
                    val link = dataSnapshot.getValue(
                        String::class.java
                    )

                    if (link != null) {
                        urlList.add(link)
                    }


                    buttonIdList.add(image_button5)
                    k++



                    Picasso.get().load(link).into(rImage4);
                    if ((k % 2) - 1 == 0 && k != 1) {
                        Controller(urlList, k, buttonIdList)

                    }


                }
                override fun onCancelled(error: DatabaseError) {
                    // Failed to read value
                    Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı",error.toException())
                }
            })
        }

        var getImageT6 = databaseReference.child("image/p22")

        var image_button6: ImageButton =findViewById(R.id.ImageT5)

        image_button6.setOnClickListener {

            getImageT6.addValueEventListener(object : ValueEventListener {
                override fun onDataChange(dataSnapshot: DataSnapshot) {
                    val link = dataSnapshot.getValue(
                        String::class.java
                    )

                    if (link != null) {
                        urlList.add(link)
                    }


                    buttonIdList.add(image_button6)
                    k++



                    Picasso.get().load(link).into(rImage5);
                    if ((k % 2) - 1 == 0 && k != 1) {
                        Controller(urlList, k, buttonIdList)

                    }


                }
                override fun onCancelled(error: DatabaseError) {
                    // Failed to read value
                    Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı",error.toException())
                }
            })
        }

        var getImageT7 = databaseReference.child("image/p23")

        var image_button7: ImageButton =findViewById(R.id.ImageT6)

        image_button7.setOnClickListener {

            getImageT7.addValueEventListener(object : ValueEventListener {
                override fun onDataChange(dataSnapshot: DataSnapshot) {
                    val link = dataSnapshot.getValue(
                        String::class.java
                    )

                    if (link != null) {
                        urlList.add(link)
                    }


                    buttonIdList.add(image_button7)
                    k++



                    Picasso.get().load(link).into(rImage6);
                    if ((k % 2) - 1 == 0 && k != 1) {
                        Controller(urlList, k, buttonIdList)

                    }


                }
                override fun onCancelled(error: DatabaseError) {
                    // Failed to read value
                    Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı",error.toException())
                }
            })
        }
        var getImageT8 = databaseReference.child("image/p22")

        var image_button8: ImageButton =findViewById(R.id.ImageT7)

        image_button8.setOnClickListener {

            getImageT8.addValueEventListener(object : ValueEventListener {
                override fun onDataChange(dataSnapshot: DataSnapshot) {
                    val link = dataSnapshot.getValue(
                        String::class.java
                    )

                    if (link != null) {
                        urlList.add(link)
                    }


                    buttonIdList.add(image_button8)
                    k++



                    Picasso.get().load(link).into(rImage7);
                    if ((k % 2) - 1 == 0 && k != 1) {
                        Controller(urlList, k, buttonIdList)

                    }


                }
                override fun onCancelled(error: DatabaseError) {
                    // Failed to read value
                    Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı",error.toException())
                }
            })
        }
        var getImageT9 = databaseReference.child("image/p21")

        var image_button9: ImageButton =findViewById(R.id.ImageT8)

        image_button9.setOnClickListener {

            getImageT9.addValueEventListener(object : ValueEventListener {
                override fun onDataChange(dataSnapshot: DataSnapshot) {
                    val link = dataSnapshot.getValue(
                        String::class.java
                    )

                    if (link != null) {
                        urlList.add(link)
                    }


                    buttonIdList.add(image_button9)
                    k++



                    Picasso.get().load(link).into(rImage8);
                    if ((k % 2) - 1 == 0 && k != 1) {
                        Controller(urlList, k, buttonIdList)

                    }


                }
                override fun onCancelled(error: DatabaseError) {
                    // Failed to read value
                    Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı",error.toException())
                }
            })
        }

        var getImageT10= databaseReference.child("image/p20")

        var image_button10: ImageButton =findViewById(R.id.ImageT9)

        image_button10.setOnClickListener {

            getImageT10.addValueEventListener(object : ValueEventListener {
                override fun onDataChange(dataSnapshot: DataSnapshot) {
                    val link = dataSnapshot.getValue(
                        String::class.java
                    )

                    if (link != null) {
                        urlList.add(link)
                    }


                    buttonIdList.add(image_button10)
                    k++



                    Picasso.get().load(link).into(rImage9);
                    if ((k % 2) - 1 == 0 && k != 1) {
                        Controller(urlList, k, buttonIdList)

                    }


                }
                override fun onCancelled(error: DatabaseError) {
                    // Failed to read value
                    Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı",error.toException())
                }
            })
        }
        var getImageT11= databaseReference.child("image/p21")

        var image_button11: ImageButton =findViewById(R.id.ImageT10)

        image_button11.setOnClickListener {

            getImageT11.addValueEventListener(object : ValueEventListener {
                override fun onDataChange(dataSnapshot: DataSnapshot) {
                    val link = dataSnapshot.getValue(
                        String::class.java
                    )

                    if (link != null) {
                        urlList.add(link)
                    }


                    buttonIdList.add(image_button11)
                    k++



                    Picasso.get().load(link).into(rImage10);
                    if ((k % 2) - 1 == 0 && k != 1) {
                        Controller(urlList, k, buttonIdList)

                    }


                }
                override fun onCancelled(error: DatabaseError) {
                    // Failed to read value
                    Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı",error.toException())
                }
            })
        }
        var getImageT12= databaseReference.child("image/p20")

        var image_button12: ImageButton =findViewById(R.id.ImageT11)

        image_button12.setOnClickListener {

            getImageT12.addValueEventListener(object : ValueEventListener {
                override fun onDataChange(dataSnapshot: DataSnapshot) {
                    val link = dataSnapshot.getValue(
                        String::class.java
                    )

                    if (link != null) {
                        urlList.add(link)
                    }


                    buttonIdList.add(image_button12)
                    k++



                    Picasso.get().load(link).into(rImage11);
                    if ((k % 2) - 1 == 0 && k != 1) {
                        Controller(urlList, k, buttonIdList)

                    }


                }
                override fun onCancelled(error: DatabaseError) {
                    // Failed to read value
                    Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı",error.toException())
                }
            })
        }
        var getImageT13= databaseReference.child("image/p19")

        var image_button13: ImageButton =findViewById(R.id.ImageT12)

        image_button13.setOnClickListener {

            getImageT13.addValueEventListener(object : ValueEventListener {
                override fun onDataChange(dataSnapshot: DataSnapshot) {
                    val link = dataSnapshot.getValue(
                        String::class.java
                    )

                    if (link != null) {
                        urlList.add(link)
                    }


                    buttonIdList.add(image_button13)
                    k++



                    Picasso.get().load(link).into(rImage12);
                    if ((k % 2) - 1 == 0 && k != 1) {
                        Controller(urlList, k, buttonIdList)

                    }


                }
                override fun onCancelled(error: DatabaseError) {
                    // Failed to read value
                    Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı",error.toException())
                }
            })
        }
        var getImageT14= databaseReference.child("image/p18")

        var image_button14: ImageButton =findViewById(R.id.ImageT13)

        image_button14.setOnClickListener {

            getImageT14.addValueEventListener(object : ValueEventListener {
                override fun onDataChange(dataSnapshot: DataSnapshot) {
                    val link = dataSnapshot.getValue(
                        String::class.java
                    )

                    if (link != null) {
                        urlList.add(link)
                    }


                    buttonIdList.add(image_button14)
                    k++



                    Picasso.get().load(link).into(rImage13);
                    if ((k % 2) - 1 == 0 && k != 1) {
                        Controller(urlList, k, buttonIdList)

                    }


                }
                override fun onCancelled(error: DatabaseError) {
                    // Failed to read value
                    Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı",error.toException())
                }
            })
        }
        var getImageT15= databaseReference.child("image/p19")

        var image_button15: ImageButton =findViewById(R.id.ImageT14)

        image_button15.setOnClickListener {

            getImageT15.addValueEventListener(object : ValueEventListener {
                override fun onDataChange(dataSnapshot: DataSnapshot) {
                    val link = dataSnapshot.getValue(
                        String::class.java
                    )

                    if (link != null) {
                        urlList.add(link)
                    }


                    buttonIdList.add(image_button15)
                    k++



                    Picasso.get().load(link).into(rImage14);
                    if ((k % 2) - 1 == 0 && k != 1) {
                        Controller(urlList, k, buttonIdList)

                    }


                }
                override fun onCancelled(error: DatabaseError) {
                    // Failed to read value
                    Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı",error.toException())
                }
            })
        }
        var getImageT16= databaseReference.child("image/p18")

        var image_button16: ImageButton =findViewById(R.id.ImageT15)

        image_button16.setOnClickListener {

            getImageT16.addValueEventListener(object : ValueEventListener {
                override fun onDataChange(dataSnapshot: DataSnapshot) {
                    val link = dataSnapshot.getValue(
                        String::class.java
                    )

                    if (link != null) {
                        urlList.add(link)
                    }


                    buttonIdList.add(image_button16)
                    k++



                    Picasso.get().load(link).into(rImage15);
                    if ((k % 2) - 1 == 0 && k != 1) {
                        Controller(urlList, k, buttonIdList)

                    }


                }
                override fun onCancelled(error: DatabaseError) {
                    // Failed to read value
                    Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı",error.toException())
                }
            })
        }
        var getImageT17= databaseReference.child("image/p17")

        var image_button17: ImageButton =findViewById(R.id.ImageT16)

        image_button17.setOnClickListener {

            getImageT17.addValueEventListener(object : ValueEventListener {
                override fun onDataChange(dataSnapshot: DataSnapshot) {
                    val link = dataSnapshot.getValue(
                        String::class.java
                    )

                    if (link != null) {
                        urlList.add(link)
                    }


                    buttonIdList.add(image_button17)
                    k++



                    Picasso.get().load(link).into(rImage16);
                    if ((k % 2) - 1 == 0 && k != 1) {
                        Controller(urlList, k, buttonIdList)

                    }


                }
                override fun onCancelled(error: DatabaseError) {
                    // Failed to read value
                    Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı",error.toException())
                }
            })
        }
        var getImageT18= databaseReference.child("image/p16")

        var image_button18: ImageButton =findViewById(R.id.ImageT17)

        image_button18.setOnClickListener {

            getImageT18.addValueEventListener(object : ValueEventListener {
                override fun onDataChange(dataSnapshot: DataSnapshot) {
                    val link = dataSnapshot.getValue(
                        String::class.java
                    )

                    if (link != null) {
                        urlList.add(link)
                    }


                    buttonIdList.add(image_button18)
                    k++



                    Picasso.get().load(link).into(rImage17);
                    if ((k % 2) - 1 == 0 && k != 1) {
                        Controller(urlList, k, buttonIdList)

                    }


                }
                override fun onCancelled(error: DatabaseError) {
                    // Failed to read value
                    Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı",error.toException())
                }
            })
        }
        var getImageT19= databaseReference.child("image/p17")

        var image_button19: ImageButton =findViewById(R.id.ImageT18)

        image_button19.setOnClickListener {

            getImageT19.addValueEventListener(object : ValueEventListener {
                override fun onDataChange(dataSnapshot: DataSnapshot) {
                    val link = dataSnapshot.getValue(
                        String::class.java
                    )

                    if (link != null) {
                        urlList.add(link)
                    }


                    buttonIdList.add(image_button19)
                    k++



                    Picasso.get().load(link).into(rImage18);
                    if ((k % 2) - 1 == 0 && k != 1) {
                        Controller(urlList, k, buttonIdList)

                    }


                }
                override fun onCancelled(error: DatabaseError) {
                    // Failed to read value
                    Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı",error.toException())
                }
            })
        }
        var getImageT20= databaseReference.child("image/p16")

        var image_button20: ImageButton =findViewById(R.id.ImageT19)

        image_button20.setOnClickListener {

            getImageT20.addValueEventListener(object : ValueEventListener {
                override fun onDataChange(dataSnapshot: DataSnapshot) {
                    val link = dataSnapshot.getValue(
                        String::class.java
                    )

                    if (link != null) {
                        urlList.add(link)
                    }


                    buttonIdList.add(image_button20)
                    k++



                    Picasso.get().load(link).into(rImage19);
                    if ((k % 2) - 1 == 0 && k != 1) {
                        Controller(urlList, k, buttonIdList)

                    }


                }
                override fun onCancelled(error: DatabaseError) {
                    // Failed to read value
                    Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı",error.toException())
                }
            })
        }
        var getImageT21= databaseReference.child("image/p34")

        var image_button21: ImageButton =findViewById(R.id.ImageT20)

        image_button21.setOnClickListener {

            getImageT21.addValueEventListener(object : ValueEventListener {
                override fun onDataChange(dataSnapshot: DataSnapshot) {
                    val link = dataSnapshot.getValue(
                        String::class.java
                    )

                    if (link != null) {
                        urlList.add(link)
                    }


                    buttonIdList.add(image_button21)
                    k++



                    Picasso.get().load(link).into(rImage20);
                    if ((k % 2) - 1 == 0 && k != 1) {
                        Controller(urlList, k, buttonIdList)

                    }


                }
                override fun onCancelled(error: DatabaseError) {
                    // Failed to read value
                    Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı",error.toException())
                }
            })
        }
        var getImageT22= databaseReference.child("image/p33")

        var image_button22: ImageButton =findViewById(R.id.ImageT21)

        image_button22.setOnClickListener {

            getImageT22.addValueEventListener(object : ValueEventListener {
                override fun onDataChange(dataSnapshot: DataSnapshot) {
                    val link = dataSnapshot.getValue(
                        String::class.java
                    )

                    if (link != null) {
                        urlList.add(link)
                    }


                    buttonIdList.add(image_button22)
                    k++



                    Picasso.get().load(link).into(rImage21);
                    if ((k % 2) - 1 == 0 && k != 1) {
                        Controller(urlList, k, buttonIdList)

                    }


                }
                override fun onCancelled(error: DatabaseError) {
                    // Failed to read value
                    Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı",error.toException())
                }
            })
        }
        var getImageT23= databaseReference.child("image/p34")

        var image_button23: ImageButton =findViewById(R.id.ImageT22)

        image_button23.setOnClickListener {

            getImageT23.addValueEventListener(object : ValueEventListener {
                override fun onDataChange(dataSnapshot: DataSnapshot) {
                    val link = dataSnapshot.getValue(
                        String::class.java
                    )

                    if (link != null) {
                        urlList.add(link)
                    }


                    buttonIdList.add(image_button23)
                    k++



                    Picasso.get().load(link).into(rImage22);
                    if ((k % 2) - 1 == 0 && k != 1) {
                        Controller(urlList, k, buttonIdList)

                    }


                }
                override fun onCancelled(error: DatabaseError) {
                    // Failed to read value
                    Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı",error.toException())
                }
            })
        }
        var getImageT24= databaseReference.child("image/p33")

        var image_button24: ImageButton =findViewById(R.id.ImageT23)

        image_button24.setOnClickListener {

            getImageT24.addValueEventListener(object : ValueEventListener {
                override fun onDataChange(dataSnapshot: DataSnapshot) {
                    val link = dataSnapshot.getValue(
                        String::class.java
                    )

                    if (link != null) {
                        urlList.add(link)
                    }


                    buttonIdList.add(image_button24)
                    k++



                    Picasso.get().load(link).into(rImage23);
                    if ((k % 2) - 1 == 0 && k != 1) {
                        Controller(urlList, k, buttonIdList)

                    }


                }
                override fun onCancelled(error: DatabaseError) {
                    // Failed to read value
                    Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı",error.toException())
                }
            })
        }
        var getImageT25= databaseReference.child("image/p32")

        var image_button25: ImageButton =findViewById(R.id.ImageT24)

        image_button25.setOnClickListener {

            getImageT25.addValueEventListener(object : ValueEventListener {
                override fun onDataChange(dataSnapshot: DataSnapshot) {
                    val link = dataSnapshot.getValue(
                        String::class.java
                    )

                    if (link != null) {
                        urlList.add(link)
                    }


                    buttonIdList.add(image_button25)
                    k++



                    Picasso.get().load(link).into(rImage24);
                    if ((k % 2) - 1 == 0 && k != 1) {
                        Controller(urlList, k, buttonIdList)

                    }


                }
                override fun onCancelled(error: DatabaseError) {
                    // Failed to read value
                    Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı",error.toException())
                }
            })
        }
        var getImageT26= databaseReference.child("image/p31")

        var image_button26: ImageButton =findViewById(R.id.ImageT25)

        image_button26.setOnClickListener {

            getImageT26.addValueEventListener(object : ValueEventListener {
                override fun onDataChange(dataSnapshot: DataSnapshot) {
                    val link = dataSnapshot.getValue(
                        String::class.java
                    )

                    if (link != null) {
                        urlList.add(link)
                    }


                    buttonIdList.add(image_button26)
                    k++



                    Picasso.get().load(link).into(rImage25);
                    if ((k % 2) - 1 == 0 && k != 1) {
                        Controller(urlList, k, buttonIdList)

                    }


                }
                override fun onCancelled(error: DatabaseError) {
                    // Failed to read value
                    Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı",error.toException())
                }
            })
        }
        var getImageT27= databaseReference.child("image/p32")

        var image_button27: ImageButton =findViewById(R.id.ImageT26)

        image_button27.setOnClickListener {

            getImageT27.addValueEventListener(object : ValueEventListener {
                override fun onDataChange(dataSnapshot: DataSnapshot) {
                    val link = dataSnapshot.getValue(
                        String::class.java
                    )

                    if (link != null) {
                        urlList.add(link)
                    }


                    buttonIdList.add(image_button27)
                    k++



                    Picasso.get().load(link).into(rImage26);
                    if ((k % 2) - 1 == 0 && k != 1) {
                        Controller(urlList, k, buttonIdList)

                    }


                }
                override fun onCancelled(error: DatabaseError) {
                    // Failed to read value
                    Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı",error.toException())
                }
            })
        }
        var getImageT28= databaseReference.child("image/p31")

        var image_button28: ImageButton =findViewById(R.id.ImageT27)

        image_button28.setOnClickListener {

            getImageT28.addValueEventListener(object : ValueEventListener {
                override fun onDataChange(dataSnapshot: DataSnapshot) {
                    val link = dataSnapshot.getValue(
                        String::class.java
                    )

                    if (link != null) {
                        urlList.add(link)
                    }


                    buttonIdList.add(image_button28)
                    k++



                    Picasso.get().load(link).into(rImage27);
                    if ((k % 2) - 1 == 0 && k != 1) {
                        Controller(urlList, k, buttonIdList)

                    }


                }
                override fun onCancelled(error: DatabaseError) {
                    // Failed to read value
                    Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı",error.toException())
                }
            })
        }
        var getImageT29= databaseReference.child("image/p39")

        var image_button29: ImageButton =findViewById(R.id.ImageT28)

        image_button29.setOnClickListener {

            getImageT29.addValueEventListener(object : ValueEventListener {
                override fun onDataChange(dataSnapshot: DataSnapshot) {
                    val link = dataSnapshot.getValue(
                        String::class.java
                    )

                    if (link != null) {
                        urlList.add(link)
                    }


                    buttonIdList.add(image_button29)
                    k++



                    Picasso.get().load(link).into(rImage28);
                    if ((k % 2) - 1 == 0 && k != 1) {
                        Controller(urlList, k, buttonIdList)

                    }


                }
                override fun onCancelled(error: DatabaseError) {
                    // Failed to read value
                    Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı",error.toException())
                }
            })
        }
        var getImageT30= databaseReference.child("image/p38")

        var image_button30: ImageButton =findViewById(R.id.ImageT29)

        image_button30.setOnClickListener {

            getImageT30.addValueEventListener(object : ValueEventListener {
                override fun onDataChange(dataSnapshot: DataSnapshot) {
                    val link = dataSnapshot.getValue(
                        String::class.java
                    )

                    if (link != null) {
                        urlList.add(link)
                    }


                    buttonIdList.add(image_button30)
                    k++



                    Picasso.get().load(link).into(rImage29);
                    if ((k % 2) - 1 == 0 && k != 1) {
                        Controller(urlList, k, buttonIdList)

                    }


                }
                override fun onCancelled(error: DatabaseError) {
                    // Failed to read value
                    Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı",error.toException())
                }
            })
        }
        var getImageT31= databaseReference.child("image/p39")

        var image_button31: ImageButton =findViewById(R.id.ImageT30)

        image_button31.setOnClickListener {

            getImageT31.addValueEventListener(object : ValueEventListener {
                override fun onDataChange(dataSnapshot: DataSnapshot) {
                    val link = dataSnapshot.getValue(
                        String::class.java
                    )

                    if (link != null) {
                        urlList.add(link)
                    }


                    buttonIdList.add(image_button31)
                    k++



                    Picasso.get().load(link).into(rImage30);
                    if ((k % 2) - 1 == 0 && k != 1) {
                        Controller(urlList, k, buttonIdList)

                    }


                }
                override fun onCancelled(error: DatabaseError) {
                    // Failed to read value
                    Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı",error.toException())
                }
            })
        }
        var getImageT32= databaseReference.child("image/p38")

        var image_button32: ImageButton =findViewById(R.id.ImageT31)

        image_button32.setOnClickListener {

            getImageT32.addValueEventListener(object : ValueEventListener {
                override fun onDataChange(dataSnapshot: DataSnapshot) {
                    val link = dataSnapshot.getValue(
                        String::class.java
                    )

                    if (link != null) {
                        urlList.add(link)
                    }


                    buttonIdList.add(image_button32)
                    k++



                    Picasso.get().load(link).into(rImage31);
                    if ((k % 2) - 1 == 0 && k != 1) {
                        Controller(urlList, k, buttonIdList)

                    }


                }
                override fun onCancelled(error: DatabaseError) {
                    // Failed to read value
                    Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı",error.toException())
                }
            })
        }
        var getImageT33= databaseReference.child("image/p37")

        var image_button33: ImageButton =findViewById(R.id.ImageT32)

        image_button33.setOnClickListener {

            getImageT33.addValueEventListener(object : ValueEventListener {
                override fun onDataChange(dataSnapshot: DataSnapshot) {
                    val link = dataSnapshot.getValue(
                        String::class.java
                    )

                    if (link != null) {
                        urlList.add(link)
                    }


                    buttonIdList.add(image_button33)
                    k++



                    Picasso.get().load(link).into(rImage32);
                    if ((k % 2) - 1 == 0 && k != 1) {
                        Controller(urlList, k, buttonIdList)

                    }


                }
                override fun onCancelled(error: DatabaseError) {
                    // Failed to read value
                    Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı",error.toException())
                }
            })
        }
        var getImageT34= databaseReference.child("image/p36")

        var image_button34: ImageButton =findViewById(R.id.ImageT33)

        image_button34.setOnClickListener {

            getImageT34.addValueEventListener(object : ValueEventListener {
                override fun onDataChange(dataSnapshot: DataSnapshot) {
                    val link = dataSnapshot.getValue(
                        String::class.java
                    )

                    if (link != null) {
                        urlList.add(link)
                    }


                    buttonIdList.add(image_button34)
                    k++



                    Picasso.get().load(link).into(rImage33);
                    if ((k % 2) - 1 == 0 && k != 1) {
                        Controller(urlList, k, buttonIdList)

                    }


                }
                override fun onCancelled(error: DatabaseError) {
                    // Failed to read value
                    Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı",error.toException())
                }
            })
        }
        var getImageT35= databaseReference.child("image/p37")

        var image_button35: ImageButton =findViewById(R.id.ImageT34)

        image_button35.setOnClickListener {

            getImageT35.addValueEventListener(object : ValueEventListener {
                override fun onDataChange(dataSnapshot: DataSnapshot) {
                    val link = dataSnapshot.getValue(
                        String::class.java
                    )

                    if (link != null) {
                        urlList.add(link)
                    }


                    buttonIdList.add(image_button35)
                    k++



                    Picasso.get().load(link).into(rImage34);
                    if ((k % 2) - 1 == 0 && k != 1) {
                        Controller(urlList, k, buttonIdList)

                    }


                }
                override fun onCancelled(error: DatabaseError) {
                    // Failed to read value
                    Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı",error.toException())
                }
            })
        }
        var getImageT36= databaseReference.child("image/p36")

        var image_button36: ImageButton =findViewById(R.id.ImageT35)

        image_button36.setOnClickListener {

            getImageT36.addValueEventListener(object : ValueEventListener {
                override fun onDataChange(dataSnapshot: DataSnapshot) {
                    val link = dataSnapshot.getValue(
                        String::class.java
                    )

                    if (link != null) {
                        urlList.add(link)
                    }


                    buttonIdList.add(image_button36)
                    k++



                    Picasso.get().load(link).into(rImage35);
                    if ((k % 2) - 1 == 0 && k != 1) {
                        Controller(urlList, k, buttonIdList)

                    }


                }
                override fun onCancelled(error: DatabaseError) {
                    // Failed to read value
                    Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı",error.toException())
                }
            })
        }

    }

    fun Controller(urlList: ArrayList<String>,k: Int,buttonIdList:ArrayList<ImageButton>) {


        if(urlList.get(k-3)==urlList.get(k-2)){     // Aynı 2 resime basılmış

            true_count++

            if(true_count==18){

                var congratulations_music = MediaPlayer.create(this, R.raw.congratulations)

                congratulations_music.start()

                var intent = Intent(this, MainActivity::class.java)
                startActivity(intent)

            }

            else if(true_count !=8){

                var victory_music = MediaPlayer.create(this, R.raw.victory)

                victory_music.start()
                // müzik çalacak
            }



        }
        else{  // farklı 2 resim

            TimeUnit.SECONDS.sleep(2L)

            var firebaseDatabase = FirebaseDatabase.getInstance()

            var databaseReference = firebaseDatabase.reference

            var getImage = databaseReference.child("image/p")
            var getImage1 = databaseReference.child("image/p")

            getImage .addValueEventListener(object : ValueEventListener {
                override fun onDataChange(dataSnapshot: DataSnapshot){
                    val link = dataSnapshot.getValue(
                        String::class.java
                    )

                    Picasso.get().load(link).into(buttonIdList.get(k-3));

                }
                override fun onCancelled(error: DatabaseError) {
                    // Failed to read value
                    Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı",error.toException())
                }
            })

            getImage1 .addValueEventListener(object : ValueEventListener {
                override fun onDataChange(dataSnapshot: DataSnapshot){
                    val link = dataSnapshot.getValue(
                        String::class.java
                    )

                    Picasso.get().load(link).into(buttonIdList.get(k-2));

                }
                override fun onCancelled(error: DatabaseError) {
                    // Failed to read value
                    Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı",error.toException())
                }
            })


        }






    }

}

