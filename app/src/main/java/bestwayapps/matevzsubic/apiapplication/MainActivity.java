package bestwayapps.matevzsubic.apiapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class MainActivity extends YouTubeBaseActivity{

    private Button button;
    private YouTubePlayerView view;
    private YouTubePlayer.OnInitializedListener onInitializedListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view = (YouTubePlayerView) findViewById(R.id.view);
        onInitializedListener = new YouTubePlayer.OnInitializedListener(){

            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("V-z8CBtnQAU");
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };

        button = (Button) findViewById(R.id.PLAY);
        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view2) {
                view.initialize("AIzaSyCXUwvQXP-6_Eb2KOBp1k33xYodjIMSKu8", onInitializedListener);
            }
        });
    }
}
