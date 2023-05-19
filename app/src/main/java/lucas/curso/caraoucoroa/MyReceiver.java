package lucas.curso.caraoucoroa;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {
        String acao;
        boolean infoextra;

        acao = intent.getAction();
        if(acao.equals("android.intent.action.AIRPLANE_MODE")){
            infoextra = intent.getBooleanExtra("state", false);
            Toast.makeText(context, "Modo aviao" + " " + infoextra, Toast.LENGTH_SHORT).show();
            Log.d("teste", "Modo aviao");
        }
    }
}