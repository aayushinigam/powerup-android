package powerup.systers.com.powerup;

import powerup.systers.com.R;

/**
 * Created by sachinaggarwal on 16/06/17.
 */

public class PowerUpUtils {

    public static final int NUMBER_OF_ROUNDS = 1;
    public static final int NUMBER_OF_CELLS = 25;
    public static final int MAXIMUM_FLIPS_ALLOWED = 5;
    public static final int RED_BANNER = 1;
    public static final int GREEN_BANNER = 0;
    public static final int TYPE_HAIR = 0;
    public static final int TYPE_CLOTHES = 1;
    public static final int TYPE_ACCESSORIES = 2;
    public static final int MAX_ELEMENTS_PER_SCREEN = 6;

    public static final String SCORE = "score";
    public static final String CORRECT_ANSWERS = "correct";
    public static final String WRONG_ANSWER = "wrong";
    public static final String MAP = "map";
    public static final String SOURCE = "source";
    public static final String SCENARIO_NAME = "scenario_name";


    public static final String CALLED_BY = "TUTORIALS_ACTIVITY";
    public static final String ID_REFERENCE = "powerup.systers.com.powerup:id/imageView";
    public static final String ID_REF = "powerup.systers.com:id/imageView";
    public static final String MINESWEEP_PREVIOUS_SCENARIO = "School";
    public static final String IS_FINAL_SCENARIO_EXTRA = "IS_FINAL_SCENARIO";

    public static final int[] ROUNDS_FAILURE_PERCENTAGES = {18, 20, 25};
    public static final int[] ROUND_BACKGROUNDS = {R.drawable.minesweeper_condom_background, R.drawable.minesweeper_condom_background, R.drawable.minesweeper_condom_background};
    public static final int[] minesViews = {R.id.imageView12, R.id.imageView0, R.id.imageView7, R.id.imageView22, R.id.imageView16, R.id.imageView19, R.id.imageView1,
            R.id.imageView2, R.id.imageView20, R.id.imageView13, R.id.imageView18, R.id.imageView23, R.id.imageView4, R.id.imageView8, R.id.imageView15, R.id.imageView21,
            R.id.imageView24, R.id.imageView3, R.id.imageView10, R.id.imageView17, R.id.imageView14, R.id.imageView5, R.id.imageView9, R.id.imageView6, R.id.imageView11};

    public static final String[][] ROUNDS_PROS_CONS = {{"Round 1 Pro 1 ", "Round 1 Pro 2", "Round 1 Con 1"},
            {"Round 2 Pro 1 ", "Round 2 Pro 2", "Round 2 Con 1"},
            {"Round 3 Pro 1 ", "Round 3 Pro 2", "Round 3 Con 1"}};

    public static volatile boolean sPauseTest = true;
    public static final String[][] SWIM_SINK_QUESTION_ANSWERS = {{"Test Ques 1: \n Answer=F","F"},{"Test Ques 2: \n Answer=T","T"},{"Test Ques 3: \n Answer=T","T"},{"Test Ques 4: \n Answer=F","F"},{"Test Ques 5: \n Answer=F","F"}};
    public static final int[] SWIM_TUTS = {R.drawable.swim_tut1,R.drawable.swim_tut2,R.drawable.swim_tut3};
    public static final int[] SCENARIO_BACKGROUNDS = {R.drawable.background,R.drawable.background,R.drawable.background,R.drawable.home_bg,R.drawable.classroom,R.drawable.hospital_bg,R.drawable.library};

    public static final int[] VOCAB_TILES_IMAGES = {R.drawable.vocab_tile1,R.drawable.vocab_tile2,R.drawable.vocab_tile3,R.drawable.vocab_cramping_tile,R.drawable.vocab_deo_tile,R.drawable.vocab_depression_tile,R.drawable.vocab_fat,R.drawable.vocab_skinny,R.drawable.vocab_tampon};
    public static final String[] VOCAB_MATCHES_BOARDS_TEXTS = {"Periods","Pimples","Bra","Cramping","Deo","Depression","Fat","Skinny","Tampon"};
    public static final int[] VOCAB_MATCH_TUTS = {R.drawable.vocab_tut1,R.drawable.vocab_tut2};

    public static final int[] MINES_TUTS = {R.drawable.mines_tut1,R.drawable.mines_tut2,R.drawable.mines_tut3};


    public static final int[] HAIR_IMAGES = {R.drawable.hair1,R.drawable.hair2,R.drawable.hair3,R.drawable.hair4,R.drawable.hair5,R.drawable.hair6,R.drawable.hair7,R.drawable.hair8,R.drawable.hair9,R.drawable.hair10,R.drawable.hair11,R.drawable.hair12,R.drawable.hair13,R.drawable.hair14,R.drawable.hair15,R.drawable.hair16,R.drawable.hair17};
    public static final String[] HAIR_POINTS_TEXTS = {"5","5","5","5","5","5","5","5","5","10","10","10","10","10","10","10","10"};

    public static final int[] CLOTHES_IMAGES = {
            R.drawable.dress1,
            R.drawable.dress2,
            R.drawable.dress3,
            R.drawable.dress4,
            R.drawable.dress5,
            R.drawable.dress6,
            R.drawable.dress7,
            R.drawable.dress8,
            R.drawable.dress9,
            R.drawable.dress10,
            R.drawable.dress11,
            R.drawable.dress12,
            R.drawable.dress13,
            R.drawable.dress14,
            R.drawable.dress15,
            R.drawable.dress16,
            R.drawable.dress17,
            R.drawable.dress18,
            R.drawable.dress19,
            R.drawable.dress20,
            R.drawable.dress21,
            R.drawable.dress22,
            R.drawable.dress23,
            R.drawable.dress24,
            R.drawable.dress25,
            R.drawable.dress26,
            R.drawable.dress27,
            R.drawable.dress28,
            R.drawable.dress29,
            R.drawable.dress30,
            R.drawable.dress31,
            R.drawable.dress32,
            R.drawable.dress33,
            R.drawable.dress34,
            R.drawable.dress35,
            R.drawable.dress36,
            R.drawable.dress37,
            R.drawable.dress38,
            R.drawable.dress39,
            R.drawable.dress40,
            R.drawable.dress41,
            R.drawable.dress42,
            R.drawable.dress43,
            R.drawable.dress44,
            R.drawable.dress45,
            R.drawable.dress46,
            R.drawable.dress47,
            R.drawable.dress48,
            R.drawable.dress49
    };
    public static final String[] CLOTHES_POINTS_TEXTS = {"5","10","10","10","5","5","10","10","10","5","5","10","10","10","5","5","10","10","10","5","5","10","10","10","5","5","10","10","10","5","5","10","10","10","5","5","10","10","10","5","5","10","10","10","5","5","10","10","10"};

    public static final int[] ACCESSORIES_IMAGES = {
            R.drawable.acc1,
            R.drawable.acc2,
            R.drawable.acc3,
            R.drawable.acc4,
            R.drawable.acc5,
            R.drawable.acc6,
            R.drawable.acc7,
            R.drawable.acc8,
            R.drawable.acc9,
            R.drawable.acc10,
            R.drawable.acc11,
            R.drawable.acc12,
            R.drawable.acc13,
            R.drawable.acc14,
            R.drawable.acc15,
            R.drawable.acc16,
            R.drawable.acc17,
            R.drawable.acc18,
            R.drawable.acc19,
            R.drawable.acc20,
            R.drawable.acc21,
            R.drawable.acc22,
            R.drawable.acc23,
            R.drawable.acc24,
            R.drawable.acc25,
            R.drawable.acc26,
            R.drawable.acc27,
            R.drawable.acc28,
            R.drawable.acc29,
            R.drawable.acc30,
            R.drawable.acc31,
            R.drawable.acc32,
            R.drawable.acc33,
            R.drawable.acc34,
            R.drawable.acc35};
    public static final String[] ACCESSORIES_POINTS_TEXTS = {"5","5","10","10","5","5","10","10","5","5","10","10","5","5","10","10","5","5","10","10","5","5","10","10","5","5","10","10","5","5","10","10","5","5","10"};
}

