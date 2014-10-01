unit Main;

interface

uses
  Winapi.Windows, Winapi.Messages, System.SysUtils, System.Variants, System.Classes, Vcl.Graphics,
  Vcl.Controls, Vcl.Forms, Vcl.Dialogs, Vcl.StdCtrls;

type
  TForm1 = class(TForm)
    Button1: TButton;
    Button2: TButton;
    Button3: TButton;
    Button4: TButton;
    procedure Button1Click(Sender: TObject);
    procedure Button2Click(Sender: TObject);
    procedure Button4Click(Sender: TObject);
    procedure Button3Click(Sender: TObject);
  private
    { Private declarations }
  public
    { Public declarations }
  end;

var
  Form1: TForm1;

implementation

uses
  Util.Records.Helpers,
  Util.Strings.Helpers, Util.Records, Util.Classes.Helpers, Util.Classes;


{$R *.dfm}

procedure TForm1.Button1Click(Sender: TObject);
begin
  Showmessage( 'Fulano'.InserirCaracterEntreLetras());
  Showmessage( 'Fulano'.InserirCaracterEntreLetras('@'));
  Showmessage( 'Fulano'.InserirCaracterEntreLetras('-'))
end;


procedure TForm1.Button2Click(Sender: TObject);
var
  Nome: string;
begin
  Nome:= 'Ciclano';

  Showmessage( Nome.InserirCaracterEntreLetras());
  Showmessage( Nome.InserirCaracterEntreLetras('@'));
  Showmessage( Nome.InserirCaracterEntreLetras('-'));
end;

procedure TForm1.Button3Click(Sender: TObject);
var
  NotaFiscal: TProcessamentoNotaFiscal;
begin
  NotaFiscal := TProcessamentoNotaFiscal.Create();
  try
    NotaFiscal.NumerNota:= 123;
    NotaFiscal.XML:= '<nota><texto>Essa é uma nota</texto></nota>';

    NotaFiscal.Salvar();
    NotaFiscal.GravaBackup();
  finally
    NotaFiscal.Free;
  end;

end;

procedure TForm1.Button4Click(Sender: TObject);
var
  Lote: TProcessarLotes;
begin
  Lote.NumeroLote:= 'ABN1245';
  Lote.Processar();
  Lote.EnviarEmail();
end;

end.

