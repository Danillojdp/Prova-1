import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Ligacao {
	//Atributos
	private int codigo;
	private String TelefoneDestino;
	private LocalDateTime DataHoraInicio;
	private LocalDateTime DataHoraFim;
	private String cidadeDestino;
	private String UFDestino;
	private Cliente cliente;
	private Empresa empresa;
	
	// Metodo get e set
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTelefoneDestino() {
		return TelefoneDestino;
	}

	public void setTelefoneDestino(String telefoneDestino) {
		TelefoneDestino = telefoneDestino;
	}

	public LocalDateTime getDataHoraInicio() {
		return DataHoraInicio;
	}

	public void setDataHoraInicio(LocalDateTime dataHoraInicio) {
		DataHoraInicio = dataHoraInicio;
	}

	public LocalDateTime getDataHoraFim() {
		return DataHoraFim;
	}

	public void setDataHoraFim(LocalDateTime dataHoraFim) {
		DataHoraFim = dataHoraFim;
	}

	public String getCidadeDestino() {
		return cidadeDestino;
	}

	public void setCidadeDestino(String cidadeDestino) {
		this.cidadeDestino = cidadeDestino;
	}

	public String getUFDestino() {
		return UFDestino;
	}

	public void setUFDestino(String uFDestino) {
		UFDestino = uFDestino;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
		
	//Metodo Construtor
	public Ligacao(int codigo, String telefoneDestino, LocalDateTime dataHoraInicio, LocalDateTime dataHoraFim,
			String cidadeDestino, String uFDestino, Cliente cliente, Empresa empresa) {
		super();
		this.codigo = codigo;
		TelefoneDestino = telefoneDestino;
		DataHoraInicio = dataHoraInicio;
		DataHoraFim = dataHoraFim;
		this.cidadeDestino = cidadeDestino;
		UFDestino = uFDestino;
		this.cliente = cliente;
		this.empresa = empresa;
	}

	//Metodo toString	
	@Override
	public String toString() {
		return "Ligacao [codigo=" + codigo + ", TelefoneDestino=" + TelefoneDestino + ", DataHoraInicio="
				+ DataHoraInicio + ", DataHoraFim=" + DataHoraFim + ", cidadeDestino=" + cidadeDestino + ", UFDestino="
				+ UFDestino + ", cliente=" + cliente + ", empresa=" + empresa + "]";
	}

	// metodo para Imprimir Data e Hora Como String
	public String getDataHoraInicioString() {
		return DataHoraInicio.getDayOfMonth() + "/" + DataHoraInicio.getMonthValue() + "/" + DataHoraInicio.getYear()
				+ " " + DataHoraInicio.getHour() + ":" + DataHoraInicio.getMinute() + "hr";
	}

	public String getDataHoraFimString() {
		return DataHoraFim.getDayOfMonth() + "/" + DataHoraFim.getMonthValue() + "/" + DataHoraFim.getYear() + " "
				+ DataHoraFim.getHour() + ":" + DataHoraFim.getMinute() + "hr";
	}

	public long diferençaHoras(LocalDateTime dataHoraInicio, LocalDateTime dataHoraFim) {
		long tempo = dataHoraInicio.until(dataHoraFim, ChronoUnit.HOURS);
		return tempo;

	}

}