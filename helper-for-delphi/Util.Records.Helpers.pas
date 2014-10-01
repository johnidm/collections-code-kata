unit Util.Records.Helpers;

interface

uses
  Util.Records;

type
  TUtilProcessarLotes = record helper for TProcessarLotes
  public
    procedure EnviarEmail();
  end;

implementation

uses
  Vcl.Dialogs;

{ TUtilProcessarLotes }

procedure TUtilProcessarLotes.EnviarEmail;
begin
  ShowMessage('Enviando e-mail ' + NumeroLote );
end;

end.
