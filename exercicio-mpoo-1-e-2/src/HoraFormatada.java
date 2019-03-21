import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class HoraFormatada {

	public String hora() {
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		Date horaAtual = Calendar.getInstance().getTime();
		String horaFormatada = sdf.format(horaAtual);
		return horaFormatada;
		
	}

}
