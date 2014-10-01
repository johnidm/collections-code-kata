program ProgramaHelpers;

uses
  Vcl.Forms,
  Main in 'Main.pas' {Form1},
  Util.Strings.Helpers in 'Util.Strings.Helpers.pas',
  Util.Records.Helpers in 'Util.Records.Helpers.pas',
  Util.Records in 'Util.Records.pas',
  Util.Classes.Helpers in 'Util.Classes.Helpers.pas',
  Util.Classes in 'Util.Classes.pas';

{$R *.res}

begin
  Application.Initialize;
  Application.MainFormOnTaskbar := True;
  Application.CreateForm(TForm1, Form1);
  Application.Run;
end.
