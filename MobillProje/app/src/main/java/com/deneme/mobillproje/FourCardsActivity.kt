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
import kotlinx.android.synthetic.main.activity_four_cards.*
import java.io.File
import java.util.concurrent.TimeUnit

class FourCardsActivity : AppCompatActivity() {

    var true_count :Int =0



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_four_cards)


        var intent = Intent(this, MainActivity::class.java)
        val shocked_music = MediaPlayer.create(this, R.raw.shocked)
        val prologue_music = MediaPlayer.create(this, R.raw.prologue)

        prologue_music.start()


        object: CountDownTimer(45000,1000){  // "CountDownTimer"(Sayaç) abstract classdan olduğu için bu şekil tanımlandı(1.parametre kaç milisaniye süreceğini,2.parametre kaç milisaniye de bir azalacağını gösterir)
            override fun onTick(p0: Long) {
                Time_Four_Cards_Game.text="Kalan:${p0/1000} sn" // p0 kalan değeri gösterir her azalmada "onTick()" methoduna girer
            }

            override fun onFinish() {		// "onFinish()" methodunda sayacın bittiği yerdir
                Time_Four_Cards_Game.text="Kalan:0 sn"

                if(true_count!=2){      // Oyunu bitiremediği zaman

                    prologue_music.pause()
                    shocked_music.start()

                    startActivity(intent)

                }
                else{

                    prologue_music.pause()


                }

            }


        }.start()

        var four_cards_stop_music_button: Button =findViewById(R.id.Four_Cards_Game_Stop_Music)

        four_cards_stop_music_button.setOnClickListener {

          prologue_music.pause()

        }


        var urlList=arrayListOf<String>()
        var buttonIdList=arrayListOf<ImageButton>()


        var k : Int=0

        var rImage : ImageButton =findViewById(R.id.ImageF);
        var rImage1 : ImageButton =findViewById(R.id.ImageF1);
        var rImage2 : ImageButton =findViewById(R.id.ImageF2);
        var rImage3 : ImageButton =findViewById(R.id.ImageF3);

        val firebaseDatabase = FirebaseDatabase.getInstance()

        val databaseReference = firebaseDatabase.reference

        val getImage = databaseReference.child("image/p")
        val getImage1 = databaseReference.child("image/p")
        val getImage2 = databaseReference.child("image/p")
        val getImage3 = databaseReference.child("image/p")



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


        var getImageT1 = databaseReference.child("image/p6")

        var image_button1: ImageButton =findViewById(R.id.ImageF)

        image_button1.setOnClickListener {

            getImageT1 .addValueEventListener(object : ValueEventListener {
                override fun onDataChange(dataSnapshot: DataSnapshot){
                    val link = dataSnapshot.getValue(
                        String::class.java
                    )

                    if (link != null) {
                        urlList.add(link)

                    }

                    buttonIdList.add(image_button1)
                    k++



                    Picasso.get().load(link).into(rImage);
                    if((k%2)-1==0 && k!=1){
                        Controller(urlList,k,buttonIdList)

                    }



                }
                override fun onCancelled(error: DatabaseError) {
                    // Failed to read value
                    Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı",error.toException())
                }
            })
        }
        var getImageT2 = databaseReference.child("image/p21")

        var image_button2: ImageButton =findViewById(R.id.ImageF1)

        image_button2.setOnClickListener {

            getImageT2 .addValueEventListener(object : ValueEventListener {
                override fun onDataChange(dataSnapshot: DataSnapshot){
                    val link = dataSnapshot.getValue(
                        String::class.java
                    )

                    if (link != null) {
                        urlList.add(link)

                    }
                    buttonIdList.add(image_button2)
                    k++


                    Picasso.get().load(link).into(rImage1);

                    if((k%2)-1==0 && k!=1){
                        Controller(urlList,k,buttonIdList)

                    }



                }
                override fun onCancelled(error: DatabaseError) {
                    // Failed to read value
                    Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı",error.toException())
                }
            })
        }
        var getImageT3 = databaseReference.child("image/p21")

        var image_button3: ImageButton =findViewById(R.id.ImageF2)

        image_button3.setOnClickListener {

            getImageT3 .addValueEventListener(object : ValueEventListener {
                override fun onDataChange(dataSnapshot: DataSnapshot){
                    val link = dataSnapshot.getValue(
                        String::class.java
                    )

                    if (link != null) {
                        urlList.add(link)

                    }
                    buttonIdList.add(image_button3)
                    k++



                    Picasso.get().load(link).into(rImage2);

                    if((k%2)-1==0 && k!=1){
                        Controller(urlList,k,buttonIdList)

                    }





                }
                override fun onCancelled(error: DatabaseError) {
                    // Failed to read value
                    Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı",error.toException())
                }
            })
        }
        var getImageT4 = databaseReference.child("image/p6")

        var image_button4: ImageButton =findViewById(R.id.ImageF3)

        image_button4.setOnClickListener {

            getImageT4 .addValueEventListener(object : ValueEventListener {
                override fun onDataChange(dataSnapshot: DataSnapshot){
                    val link = dataSnapshot.getValue(
                        String::class.java
                    )

                    if (link != null) {
                        urlList.add(link)

                    }
                    buttonIdList.add(image_button4)
                    k++


                    Picasso.get().load(link).into(rImage3);

                    if((k%2)-1==0 && k!=1){
                        Controller(urlList,k,buttonIdList)

                    }




                }
                override fun onCancelled(error: DatabaseError) {
                    // Failed to read value
                    Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı",error.toException())
                }
            })
        }

    }

    fun Controller(urlList: ArrayList<String>,k: Int,buttonIdList:ArrayList<ImageButton>){

        if(urlList.get(k-3)==urlList.get(k-2)){     // Aynı 2 resime basılmış

            true_count++

            if(true_count==2){

                var congratulations_music = MediaPlayer.create(this, R.raw.congratulations)

                congratulations_music.start()

                var intent = Intent(this, MainActivity::class.java)
                startActivity(intent)

            }

            else if(true_count !=2){


                var victory_music = MediaPlayer.create(this, R.raw.victory)

                victory_music.start()

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