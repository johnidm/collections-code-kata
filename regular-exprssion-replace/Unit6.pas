unit Unit6;

interface

uses
  Winapi.Windows, Winapi.Messages, System.SysUtils, System.Variants, System.Classes, Vcl.Graphics,
  Vcl.Controls, Vcl.Forms, Vcl.Dialogs, Vcl.StdCtrls;

type
  TForm6 = class(TForm)
    GroupBox1: TGroupBox;
    Button2: TButton;
    Edit1: TEdit;
    Label1: TLabel;
    SaveDialog1: TSaveDialog;
    Button1: TButton;
    OpenDialog1: TOpenDialog;
    Memo1: TMemo;
    Memo2: TMemo;
    Label2: TLabel;
    Label3: TLabel;
    procedure Button1Click(Sender: TObject);
    procedure Button2Click(Sender: TObject);
  private
    { Private declarations }
  public
    { Public declarations }
  end;

var
  Form6: TForm6;

implementation

uses
  System.RegularExpressions;

{$R *.dfm}

procedure TForm6.Button1Click(Sender: TObject);
var
  Texto: string;
  StringList: TStringList;
begin
  if (OpenDialog1.Execute()) then
  begin

    StringList:= TStringList.Create;
    try
      StringList.LoadFromFile( OpenDialog1.FileName );

      Texto:= TRegEx.Replace( StringList.Text, '[A-Za-z0-9]+@[A-Za-z0-9]+', '' );

      Memo1.Clear;
      Memo1.Text:= StringList.Text;

      Memo2.Clear;
      Memo2.Text:= Texto;

    finally
      FreeAndNil(StringList);
    end;

  end;
end;

procedure TForm6.Button2Click(Sender: TObject);
var
  StringList: TStringList;
  Cont: Integer;
begin
  StringList:= TStringList.Create;
  try
    if SaveDialog1.Execute then
    begin
      for Cont := 1 to StrToInt(Edit1.Text) do
        StringList.Add('(16BA=1cc)(83=cliente1@plantao)(80=0)(82=1)(1691=610)(1690(89=cliente@frigorifico)(8A');

      StringList.SaveToFile( SaveDialog1.FileName );
    end;
  finally
    FreeAndNil(StringList);

  end;


end;

end.
