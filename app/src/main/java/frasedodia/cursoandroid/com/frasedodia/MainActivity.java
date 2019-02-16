package frasedodia.cursoandroid.com.frasedodia;

import android.service.notification.NotificationListenerService;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textoNovaFrase;
    private Button botaoNovaFrase;

    private String[] frases = {
            "Sua luta não termina quando sentir cansaço, mas sim quando atingir o sucesso tão merecido.",
            "Você não só tem o direito de ser feliz como também tem a obrigação de lutar para alcançar a felicidade.",
            "As pessoas dizem frequentemente que a motivação não dura. Bem, nem o banho - e é por isso que ele é recomendado diariamente. - Zig Ziglar",
            "Às vezes um pouco de motivação ajuda a superar os maiores desafios.",
            "Toda ação humana, quer se torne positiva ou negativa, precisa depender de motivação.- Dalai Lama"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoNovaFrase = findViewById(R.id.TextoNovaFraseID);
        botaoNovaFrase = findViewById(R.id.BotaoNovaFraseId);


        botaoNovaFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random randomico = new Random();

                //sorteia numeros que vão até o tamanho total do vetor de strings -  frases.length
                int numeroAleatorio = randomico.nextInt( frases.length );

                //o numero sorteado será a posicao do vetor frases[]
                textoNovaFrase.setText( frases[numeroAleatorio]);
            }
        });
    }
}
