package ca.blogspot.sjatyourservice.mathematicalquiz;

 import android.content.Intent;
 import android.os.Handler;
 import android.support.v7.app.AppCompatActivity;
 import android.os.Bundle;
 import android.webkit.WebViewClient;

 import com.google.android.gms.ads.AdListener;
 import com.google.android.gms.ads.AdRequest;
 import com.google.android.gms.ads.InterstitialAd;
 import com.google.android.gms.ads.MobileAds;

public class MainActivity extends AppCompatActivity
{
  private final int SPLASH_DISPLAY_LENGTH =1500;
	private InterstitialAd interstitialAd;
  @Override
  protected void onCreate(Bundle savedInstanceState)
 {
 super.onCreate(savedInstanceState);

 setContentView(R.layout.activity_main);
 MobileAds.initialize(this,"ca-app-pub-5278704802151871~3247115412");




	 interstitialAd = new InterstitialAd(this);
	 interstitialAd.setAdUnitId("ca-app-pub-5278704802151871/8999592129");
	 // interstitialAd.loadAd(new AdRequest.Builder().addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
	 //		.build());



			 new Handler().postDelayed(new Runnable()
			 {
				 @Override
				 public void run()
				 {


					 interstitialAd.loadAd(new AdRequest.Builder().build());

					 interstitialAd.setAdListener(new AdListener() {
						 @Override
						 public void onAdClosed() {
							 Intent Quizpage=new Intent(MainActivity.this,MATH_QUIZ.class);
							 MainActivity.this.startActivity(Quizpage);
							 MainActivity.this.finish();
							 interstitialAd.loadAd(new AdRequest.Builder().build());
						 }
					 });


				 }
			 }, SPLASH_DISPLAY_LENGTH);







	 if(interstitialAd.isLoaded())

	 {
		 interstitialAd.show();
	 }
	 else
	 {



		 new Handler().postDelayed(new Runnable()
		 {
			 @Override
			 public void run()
			 {
				 Intent Quizpage=new Intent(MainActivity.this,MATH_QUIZ.class);
				 MainActivity.this.startActivity(Quizpage);
				 MainActivity.this.finish();
			 }
		 }, SPLASH_DISPLAY_LENGTH);
	 }







 }
 }

/**
 App ID: ca-app-pub-5278704802151871~3247115412
 Ad unit ID: ca-app-pub-5278704802151871/8116298716 // BANNER AD
//INTERSTITIAL AD UNIT
 interstitialAd.setAdUnitId("ca-app-pub-5278704802151871/8999592129");
 **/