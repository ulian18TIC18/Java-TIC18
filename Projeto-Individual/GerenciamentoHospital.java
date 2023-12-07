import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

class Pessoa {
    private String nome;
    private String cpf;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    // Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}

class Paciente extends Pessoa {
    public Paciente(String nome, String cpf) {
        super(nome, cpf);
    }
    // Outros atributos e métodos específicos do paciente, se necessário
}

class Enfermeiro extends Pessoa {
    public Enfermeiro(String nome, String cpf) {
        super(nome, cpf);
    }
    // Outros atributos e métodos específicos do enfermeiro, se necessário
}

class Medico extends Pessoa {
    public Medico(String nome, String cpf) {
        super(nome, cpf);
    }
    // Outros atributos e métodos específicos do médico, se necessário
}

class Medicamento {
    private String nome;
    private String tipo;

    public Medicamento(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    // Getters e Setters
}

class Insumo {
    private String nome;
    private String tipo;

    public Insumo(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    // Getters e Setters
}

class Procedimento {
    private String nome;
    private List<Medico> medicos;
    private List<Enfermeiro> enfermeiros;
    private List<Medicamento> medicamentos;
    private List<Insumo> insumos;

    public Procedimento(String nome) {
        this.nome = nome;
        this.medicos = new ArrayList<>();
        this.enfermeiros = new ArrayList<>();
        this.medicamentos = new ArrayList<>();
        this.insumos = new ArrayList<>();
    }

    // Getters e Setters
}

class Atendimento {
    private Paciente paciente;
    private Procedimento procedimento;
    private Medico medicoResponsavel;
    private Enfermeiro enfermeiroResponsavel;
    private LocalDateTime dataHoraInicio;
    private LocalDateTime dataHoraFim;

    public Atendimento(Paciente paciente, Procedimento procedimento, Medico medicoResponsavel,
                       Enfermeiro enfermeiroResponsavel, LocalDateTime dataHoraInicio) {
        this.paciente = paciente;
        this.procedimento = procedimento;
        this.medicoResponsavel = medicoResponsavel;
        this.enfermeiroResponsavel = enfermeiroResponsavel;
        this.dataHoraInicio = dataHoraInicio;
    }

    // Getters e Setters
}

class Triagem {
    private Enfermeiro enfermeiroResponsavel;
    private Paciente paciente;
    private LocalDateTime dataHora;

    public Triagem(Enfermeiro enfermeiroResponsavel, Paciente paciente, LocalDateTime dataHora) {
        this.enfermeiroResponsavel = enfermeiroResponsavel;
        this.paciente = paciente;
        this.dataHora = dataHora;
    }

    // Getters e Setters
}

class SistemaHospitalar {
    private List<Paciente> pacientes;
    private List<Enfermeiro> enfermeiros;
    private List<Medico> medicos;
    private List<Medicamento> medicamentos;
    private List<Insumo> insumos;
    private List<Procedimento> procedimentos;
    private List<Atendimento> atendimentos;
    private List<Triagem> triagens;

    public SistemaHospitalar() {
        this.pacientes = new ArrayList<>();
        this.enfermeiros = new ArrayList<>();
        this.medicos = new ArrayList<>();
        this.medicamentos = new ArrayList<>();
        this.insumos = new ArrayList<>();
        this.procedimentos = new ArrayList<>();
        this.atendimentos = new ArrayList<>();
        this.triagens = new ArrayList<>();
    }

    public void cadastrarPaciente(Paciente paciente) {
        this.pacientes.add(paciente);
    }

    public void cadastrarEnfermeiro(Enfermeiro enfermeiro) {
        this.enfermeiros.add(enfermeiro);
    }

    public void cadastrarMedico(Medico medico) {
        this.medicos.add(medico);
    }

    public void cadastrarMedicamento(Medicamento medicamento) {
        this.medicamentos.add(medicamento);
    }

    public void cadastrarInsumo(Insumo insumo) {
        this.insumos.add(insumo);
    }

    public void cadastrarProcedimento(Procedimento procedimento) {
        this.procedimentos.add(procedimento);
    }

    public void cadastrarAtendimento(Atendimento atendimento) {
        this.atendimentos.add(atendimento);
    }

    public void realizarTriagem(Enfermeiro enfermeiro, Paciente paciente) {
        Triagem triagem = new Triagem(enfermeiro, paciente, LocalDateTime.now());
        this.triagens.add(triagem);
    }

    // Outros métodos para cadastros e registros...

    public static void main(String[] args) {
        SistemaHospitalar hospital = new SistemaHospitalar();

        Paciente paciente = new Paciente("João", "123.456.789-00");
        Medico medico = new Medico("Maria", "987.654.321-00");
        Enfermeiro enfermeiro = new Enfermeiro("Pedro", "210.987.654-00");
        Procedimento procedimento = new Procedimento("Cirurgia de rim");

        procedimento.getMedicos().add(medico);
        procedimento.getEnfermeiros().add(enfermeiro);

        procedimento.getMedicamentos().add(new Medicamento("Paracetamol", "Anti-inflamatório não esteroide"));
        procedimento.getInsumos().add(new Insumo("Seringa", "Insumo médico"));

        Atendimento atendimento = new Atendimento(paciente, procedimento, medico, enfermeiro, LocalDateTime.now());

        hospital.cadastrarPaciente(paciente);
        hospital.cadastrarMedico(medico);
        hospital.cadastrarEnfermeiro(enfermeiro);
        hospital.cadastrarProcedimento(procedimento);
        hospital.cadastrarAtendimento(atendimento);

        // Exemplo de uso de outros métodos do sistema...

        hospital.realizarTriagem(enfermeiro, paciente);
    }
}

