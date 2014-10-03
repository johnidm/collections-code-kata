unit Util.Records;

interface

type
  TProcessarLotes = record
  public
    NumeroLote: string;
    procedure Processar();
  end;

implementation

uses
  Vcl.Dialogs;

procedure TProcessarLotes.Processar;
begin
  ShowMessage('Processando lote ' + NumeroLote);
end;

end.
