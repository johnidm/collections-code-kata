object Form1: TForm1
  Left = 0
  Top = 0
  Caption = 'Form1'
  ClientHeight = 145
  ClientWidth = 506
  Color = clBtnFace
  Font.Charset = DEFAULT_CHARSET
  Font.Color = clWindowText
  Font.Height = -11
  Font.Name = 'Tahoma'
  Font.Style = []
  OldCreateOrder = False
  PixelsPerInch = 96
  TextHeight = 13
  object ComboBox1: TComboBox
    Left = 320
    Top = 24
    Width = 145
    Height = 21
    TabOrder = 0
    Text = 'Job 1'
    Items.Strings = (
      'Job 1'
      'Job 2'
      'Job Outside'
      'Job 3')
  end
  object Button1: TButton
    Left = 320
    Top = 51
    Width = 145
    Height = 25
    Caption = 'Execute Selected Job'
    TabOrder = 1
    OnClick = Button1Click
  end
  object Button2: TButton
    Left = 320
    Top = 82
    Width = 145
    Height = 25
    Caption = 'Execute All Jobs'
    TabOrder = 2
    OnClick = Button2Click
  end
  object Button3: TButton
    Left = 32
    Top = 24
    Width = 145
    Height = 96
    Caption = 'Create Jobs'
    TabOrder = 3
    OnClick = Button3Click
  end
end
