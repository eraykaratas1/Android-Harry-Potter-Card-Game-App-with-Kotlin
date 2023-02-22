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
import kotlinx.android.synthetic.main.activity_sixteen_cards_multi_player.*
import java.util.concurrent.TimeUnit

class SixteenCardsMultiPlayerActivity : AppCompatActivity() {

    var true_count :Int =0
    var false_count:Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sixteen_cards_multi_player)

        var intent = Intent(this, LoginActivity::class.java)
        val shocked_music = MediaPlayer.create(this, R.raw.shocked)
        val prologue_music = MediaPlayer.create(this, R.raw.prologue)
        prologue_music.start()

        object : CountDownTimer(
            60000,
            1000
        ) {  // "CountDownTimer"(Sayaç) abstract classdan olduğu için bu şekil tanımlandı(1.parametre kaç milisaniye süreceğini,2.parametre kaç milisaniye de bir azalacağını gösterir)
            override fun onTick(p0: Long) {
                Time_Sixteen_Cards_Multi_Game.text =
                    "Kalan:${p0 / 1000} sn" // p0 kalan değeri gösterir her azalmada "onTick()" methoduna girer
            }

            override fun onFinish() {        // "onFinish()" methodunda sayacın bittiği yerdir
                Time_Sixteen_Cards_Multi_Game.text = "Kalan:0 sn"


                if (true_count != 8 && false_count==0) {      // Oyunu bitiremediği zaman

                    prologue_music.pause()
                    shocked_music.start()

                    startActivity(intent)

                } else {

                    prologue_music.pause()


                }
            }


        }.start()

        var sixteen_cards_multi_stop_music_button: Button =findViewById(R.id.Sixteen_Cards_Multi_Game_Stop_Music)

        sixteen_cards_multi_stop_music_button.setOnClickListener {

            prologue_music.pause()

        }


        var urlList = arrayListOf<String>()
        var buttonIdList = arrayListOf<ImageButton>()


        var k: Int = 0

        var rImage: ImageButton = findViewById(R.id.ImageM)
        var rImage1: ImageButton = findViewById(R.id.ImageM1)
        var rImage2: ImageButton = findViewById(R.id.ImageM2)
        var rImage3: ImageButton = findViewById(R.id.ImageM3)
        var rImage4: ImageButton = findViewById(R.id.ImageM4)
        var rImage5: ImageButton = findViewById(R.id.ImageM5)
        var rImage6: ImageButton = findViewById(R.id.ImageM6)
        var rImage7: ImageButton = findViewById(R.id.ImageM7)
        var rImage8: ImageButton = findViewById(R.id.ImageM8)
        var rImage9: ImageButton = findViewById(R.id.ImageM9)
        var rImage10: ImageButton = findViewById(R.id.ImageM10)
        var rImage11: ImageButton = findViewById(R.id.ImageM11)
        var rImage12: ImageButton = findViewById(R.id.ImageM12)
        var rImage13: ImageButton = findViewById(R.id.ImageM13)
        var rImage14: ImageButton = findViewById(R.id.ImageM14)
        var rImage15: ImageButton = findViewById(R.id.ImageM15)


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
        var getImage11 = databaseReference.child("image/p")
        var getImage12 = databaseReference.child("image/p")
        var getImage13 = databaseReference.child("image/p")
        var getImage14 = databaseReference.child("image/p")
        var getImage15 = databaseReference.child("image/p")


        getImage.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                val link = dataSnapshot.getValue(
                    String::class.java
                )

                Picasso.get().load(link).into(rImage);

            }

            override fun onCancelled(error: DatabaseError) {
                // Failed to read value
                Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı", error.toException())
            }
        })

        getImage1.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                val link = dataSnapshot.getValue(
                    String::class.java
                )

                Picasso.get().load(link).into(rImage1);

            }

            override fun onCancelled(error: DatabaseError) {
                // Failed to read value
                Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı", error.toException())
            }
        })

        getImage2.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                val link = dataSnapshot.getValue(
                    String::class.java
                )

                Picasso.get().load(link).into(rImage2);

            }

            override fun onCancelled(error: DatabaseError) {
                // Failed to read value
                Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı", error.toException())
            }
        })

        getImage3.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                val link = dataSnapshot.getValue(
                    String::class.java
                )

                Picasso.get().load(link).into(rImage3);

            }

            override fun onCancelled(error: DatabaseError) {
                // Failed to read value
                Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı", error.toException())
            }
        })

        getImage4.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                val link = dataSnapshot.getValue(
                    String::class.java
                )

                Picasso.get().load(link).into(rImage4);

            }

            override fun onCancelled(error: DatabaseError) {
                // Failed to read value
                Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı", error.toException())
            }
        })

        getImage5.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                val link = dataSnapshot.getValue(
                    String::class.java
                )

                Picasso.get().load(link).into(rImage5);

            }

            override fun onCancelled(error: DatabaseError) {
                // Failed to read value
                Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı", error.toException())
            }
        })

        getImage6.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                val link = dataSnapshot.getValue(
                    String::class.java
                )

                Picasso.get().load(link).into(rImage6);

            }

            override fun onCancelled(error: DatabaseError) {
                // Failed to read value
                Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı", error.toException())
            }
        })

        getImage7.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                val link = dataSnapshot.getValue(
                    String::class.java
                )

                Picasso.get().load(link).into(rImage7);

            }

            override fun onCancelled(error: DatabaseError) {
                // Failed to read value
                Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı", error.toException())
            }
        })

        getImage8.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                val link = dataSnapshot.getValue(
                    String::class.java
                )

                Picasso.get().load(link).into(rImage8);

            }

            override fun onCancelled(error: DatabaseError) {
                // Failed to read value
                Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı", error.toException())
            }
        })

        getImage9.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                val link = dataSnapshot.getValue(
                    String::class.java
                )

                Picasso.get().load(link).into(rImage9);

            }

            override fun onCancelled(error: DatabaseError) {
                // Failed to read value
                Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı", error.toException())
            }
        })

        getImage10.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                val link = dataSnapshot.getValue(
                    String::class.java
                )

                Picasso.get().load(link).into(rImage10);

            }

            override fun onCancelled(error: DatabaseError) {
                // Failed to read value
                Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı", error.toException())
            }
        })

        getImage11.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                val link = dataSnapshot.getValue(
                    String::class.java
                )

                Picasso.get().load(link).into(rImage11);

            }

            override fun onCancelled(error: DatabaseError) {
                // Failed to read value
                Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı", error.toException())
            }
        })

        getImage12.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                val link = dataSnapshot.getValue(
                    String::class.java
                )

                Picasso.get().load(link).into(rImage12);

            }

            override fun onCancelled(error: DatabaseError) {
                // Failed to read value
                Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı", error.toException())
            }
        })

        getImage13.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                val link = dataSnapshot.getValue(
                    String::class.java
                )

                Picasso.get().load(link).into(rImage13);

            }

            override fun onCancelled(error: DatabaseError) {
                // Failed to read value
                Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı", error.toException())
            }
        })

        getImage14.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                val link = dataSnapshot.getValue(
                    String::class.java
                )

                Picasso.get().load(link).into(rImage14);

            }

            override fun onCancelled(error: DatabaseError) {
                // Failed to read value
                Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı", error.toException())
            }
        })

        getImage15.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                val link = dataSnapshot.getValue(
                    String::class.java
                )

                Picasso.get().load(link).into(rImage15);

            }

            override fun onCancelled(error: DatabaseError) {
                // Failed to read value
                Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı", error.toException())
            }
        })

        var getImageT1 = databaseReference.child("image/p1")

        var image_button1: ImageButton = findViewById(R.id.ImageM)
        image_button1.setOnClickListener {

            getImageT1.addValueEventListener(object : ValueEventListener {
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
                    Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı", error.toException())
                }
            })
        }

        var getImageT2 = databaseReference.child("image/p3")

        var image_button2: ImageButton = findViewById(R.id.ImageM1)
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
                    Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı", error.toException())
                }
            })
        }

        var getImageT3 = databaseReference.child("image/p1")

        var image_button3: ImageButton = findViewById(R.id.ImageM2)
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
                    Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı", error.toException())
                }
            })
        }

        var getImageT4 = databaseReference.child("image/p3")

        var image_button4: ImageButton = findViewById(R.id.ImageM3)
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
                    Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı", error.toException())
                }
            })
        }

        var getImageT5 = databaseReference.child("image/p8")

        var image_button5: ImageButton = findViewById(R.id.ImageM4)
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
                    Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı", error.toException())
                }
            })
        }
        var getImageT6 = databaseReference.child("image/p24")

        var image_button6: ImageButton = findViewById(R.id.ImageM5)
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
                    Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı", error.toException())
                }
            })
        }
        var getImageT7 = databaseReference.child("image/p8")

        var image_button7: ImageButton = findViewById(R.id.ImageM6)
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
                    Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı", error.toException())
                }
            })
        }
        var getImageT8 = databaseReference.child("image/p24")

        var image_button8: ImageButton = findViewById(R.id.ImageM7)
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
                    Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı", error.toException())
                }
            })
        }
        var getImageT9 = databaseReference.child("image/p26")

        var image_button9: ImageButton = findViewById(R.id.ImageM8)
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
                    Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı", error.toException())
                }
            })
        }
        var getImageT10 = databaseReference.child("image/p32")

        var image_button10: ImageButton = findViewById(R.id.ImageM9)
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
                    Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı", error.toException())
                }
            })
        }
        var getImageT11 = databaseReference.child("image/p26")

        var image_button11: ImageButton = findViewById(R.id.ImageM10)
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
                    Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı", error.toException())
                }
            })
        }
        var getImageT12 = databaseReference.child("image/p32")

        var image_button12: ImageButton = findViewById(R.id.ImageM11)
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
                    Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı", error.toException())
                }
            })
        }
        var getImageT13 = databaseReference.child("image/p11")

        var image_button13: ImageButton = findViewById(R.id.ImageM12)
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
                    Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı", error.toException())
                }
            })
        }
        var getImageT14 = databaseReference.child("image/p19")

        var image_button14: ImageButton = findViewById(R.id.ImageM13)
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
                    Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı", error.toException())
                }
            })
        }
        var getImageT15 = databaseReference.child("image/p11")

        var image_button15: ImageButton = findViewById(R.id.ImageM14)
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
                    Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı", error.toException())
                }
            })
        }
        var getImageT16 = databaseReference.child("image/p19")

        var image_button16: ImageButton = findViewById(R.id.ImageM15)
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
                    Log.w(ContentValues.TAG, "Hatalı durum,veriyi okumadı", error.toException())
                }
            })
        }
    }

        fun Controller(urlList: ArrayList<String>,k: Int,buttonIdList:ArrayList<ImageButton>) {


            if(urlList.get(k-3)==urlList.get(k-2)){     // Aynı 2 resime basılmış

                true_count++

                if(true_count==8){ // Tüm kartların eşleşmesini yaptıysa(Oyunu bitirdi)

                    var congratulations_music = MediaPlayer.create(this, R.raw.congratulations)

                    congratulations_music.start()

                    var intent = Intent(this, LoginActivity::class.java)
                    startActivity(intent)

                }

                else if(true_count !=8){    //  Sadece 2 kartın eşleşmesini yaptıysa

                    var victory_music = MediaPlayer.create(this, R.raw.victory)

                    victory_music.start()
                    // müzik çalacak
                }



            }
            else{  // farklı 2 resim

                false_count++

                var shocked_music = MediaPlayer.create(this, R.raw.shocked)
                shocked_music.start()


                var intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)

            }

        }



}