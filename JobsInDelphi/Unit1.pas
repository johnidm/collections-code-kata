unit Unit1;

interface

uses
  Winapi.Windows, Winapi.Messages, System.SysUtils, System.Variants, System.Classes, Vcl.Graphics,
  Vcl.Controls, Vcl.Forms, Vcl.Dialogs, Vcl.StdCtrls;

type
  TForm1 = class(TForm)
    ComboBox1: TComboBox;
    Button1: TButton;
    Button2: TButton;
    Button3: TButton;
    procedure Button3Click(Sender: TObject);
    procedure Button1Click(Sender: TObject);
    procedure Button2Click(Sender: TObject);
  private

    Jobs: array[0..3] of TFunc<Boolean>;

    procedure CreateJobs();

    function JobOutside(): Boolean;

  public

  end;

var
  Form1: TForm1;

implementation

{$R *.dfm}



{ TForm1 }

procedure TForm1.Button1Click(Sender: TObject);
var
  Func: TFunc<Boolean>;
begin
  Func:= Jobs[ComboBox1.ItemIndex];

  if (Assigned( Func )) then
    if (not(Func)) then
      raise Exception.Create('Job fail');
end;

procedure TForm1.Button2Click(Sender: TObject);
var
  Func: TFunc<Boolean>;
begin
  for Func in Jobs do
  begin  
    if ( Assigned(Func) ) then
      if (not(Func)) then
        raise Exception.Create('Job fail');
  end;
end;

procedure TForm1.Button3Click(Sender: TObject);
begin
  CreateJobs();
end;

procedure TForm1.CreateJobs;
begin
  Jobs[0]:=
    function : Boolean
    begin
      ShowMessage('Executing Job 1');
      Result:= True;
    end;

  Jobs[1]:=
    function : Boolean
    begin
      ShowMessage('Executing Job 2');
      Result:= True;
    end;

  Jobs[2]:= JobOutside;

  Jobs[3]:=
    function : Boolean
    begin
      ShowMessage('Executing Job 3');
      Result:= FAlse;
    end;
end;

function TForm1.JobOutside: Boolean;
begin
  ShowMessage('Executing Job Outside');
  Result:= True;
end;

end.
