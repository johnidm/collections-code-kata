unit Util.Classes;

interface

uses
  System.SysUtils;

type
  TProcessamentoNotaFiscal = class
  private
    FNumerNota: Integer;
    FXML: string;
  public
    property NumerNota: Integer read FNumerNota write FNumerNota;
    property XML: string read FXML write FXML;
    procedure Salvar();
  end;

implementation

uses
  Vcl.Dialogs;

{ TProessamentoNotaFiscal }

procedure TProcessamentoNotaFiscal.Salvar;
begin
  ShowMessage('Salvando Nota Fiscal --> ' + NumerNota.ToString );
end;

end.
