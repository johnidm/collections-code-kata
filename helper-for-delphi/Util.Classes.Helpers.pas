unit Util.Classes.Helpers;

interface

uses
  System.SysUtils,
  Util.Classes;

type
  TProcessamentoNotaFiscalBackup = class helper for TProcessamentoNotaFiscal
  private
    FEfetuarBackup: Boolean;
  public
    function GravaBackup(): Boolean;
    constructor Create();
  end;

implementation

uses
  Vcl.Dialogs;

{ TProessamentoNotaFiscalBackup }

constructor TProcessamentoNotaFiscalBackup.Create;
begin
  FEfetuarBackup:= True;
end;


function TProcessamentoNotaFiscalBackup.GravaBackup: Boolean;
begin
  if (FEfetuarBackup) then
  begin
    ShowMessage('Realizando backup da nota ' + NumerNota.ToString +
      sLineBreak + 'XML' + sLineBreak + XML);
  end;
end;

end.
