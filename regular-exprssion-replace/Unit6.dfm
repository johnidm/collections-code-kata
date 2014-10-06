object Form6: TForm6
  Left = 0
  Top = 0
  Caption = 'Form6'
  ClientHeight = 478
  ClientWidth = 941
  Color = clBtnFace
  Font.Charset = DEFAULT_CHARSET
  Font.Color = clWindowText
  Font.Height = -11
  Font.Name = 'Tahoma'
  Font.Style = []
  OldCreateOrder = False
  PixelsPerInch = 96
  TextHeight = 13
  object Label2: TLabel
    Left = 30
    Top = 178
    Width = 76
    Height = 13
    Caption = 'Arquivo Original'
  end
  object Label3: TLabel
    Left = 465
    Top = 178
    Width = 95
    Height = 13
    Caption = 'Arquivo Processado'
  end
  object GroupBox1: TGroupBox
    Left = 8
    Top = 8
    Width = 329
    Height = 93
    Caption = 'Gerar arquivo para teste'
    TabOrder = 0
    object Label1: TLabel
      Left = 15
      Top = 29
      Width = 65
      Height = 13
      Caption = 'Linhas aquivo'
    end
    object Button2: TButton
      Left = 223
      Top = 24
      Width = 75
      Height = 25
      Caption = 'Gerar Arquivo'
      TabOrder = 0
      OnClick = Button2Click
    end
    object Edit1: TEdit
      Left = 86
      Top = 26
      Width = 121
      Height = 21
      NumbersOnly = True
      TabOrder = 1
      Text = '10000'
    end
  end
  object Button1: TButton
    Left = 260
    Top = 107
    Width = 354
    Height = 46
    Caption = 'Processar Arquivo'
    TabOrder = 1
    OnClick = Button1Click
  end
  object Memo1: TMemo
    Left = 30
    Top = 194
    Width = 390
    Height = 276
    Lines.Strings = (
      'Memo1')
    TabOrder = 2
  end
  object Memo2: TMemo
    Left = 465
    Top = 194
    Width = 390
    Height = 276
    Lines.Strings = (
      'Memo1')
    TabOrder = 3
  end
  object SaveDialog1: TSaveDialog
    FileName = 'arquivo'
    Filter = '*txt|*txt'
    Left = 52
    Top = 9
  end
  object OpenDialog1: TOpenDialog
    Left = 311
    Top = 138
  end
end
