package in.dropcodes.droptoast;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DropToast {

    private int mType;
    public static final int SUCCESS = 0;
    public static final int ERROR = 1;
    public static final int WARNING = 2;
    public static final int DEFAULT = 3;
    public static final int CONFUSED = 4;


    public static final int LONG = 1;
    public static final int SHORT = 0;

    public static void makeText(Context context, String message , int type,int duration){

        Toast toast = new Toast(context);
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.toast_view,null);
        TextView text = view.findViewById(R.id.text);
        ImageView icon = view.findViewById(R.id.icon);

        switch (type){
            case SUCCESS:
                icon.setImageDrawable(ContextCompat.getDrawable(context,R.drawable.ic_success));
                view.setBackground(ContextCompat.getDrawable(context,R.drawable.toast_background_success));
                break;
            case ERROR:
                icon.setImageDrawable(ContextCompat.getDrawable(context,R.drawable.ic_error));
                view.setBackground(ContextCompat.getDrawable(context,R.drawable.toast_background_error));
                break;
            case WARNING:
                icon.setImageDrawable(ContextCompat.getDrawable(context,R.drawable.ic_info));
                view.setBackground(ContextCompat.getDrawable(context,R.drawable.toast_background_warning));
                break;
            case DEFAULT:
                icon.setImageDrawable(ContextCompat.getDrawable(context,R.drawable.ic_defalut));
                view.setBackground(ContextCompat.getDrawable(context,R.drawable.toast_background_default));
                break;
            case CONFUSED:
                icon.setImageDrawable(ContextCompat.getDrawable(context,R.drawable.ic_confused));
                view.setBackground(ContextCompat.getDrawable(context,R.drawable.toast_background_confused));
                break;
                default:
                    icon.setImageDrawable(ContextCompat.getDrawable(context,R.drawable.ic_defalut));
                    view.setBackground(ContextCompat.getDrawable(context,R.drawable.toast_background_default));
                    break;
        }

        text.setText(message);
        toast.setView(view);
        toast.setDuration(duration);
        toast.show();

    }
}