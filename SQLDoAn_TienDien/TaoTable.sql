USE [TinhTienDien]
GO

CREATE TABLE [dbo].[PERSON_INFO](
    [CCCD] [nvarchar](50) NOT NULL,
	[Username] [nvarchar](50) NOT NULL,
	[DOB] [date] NULL,
	[Address] [nvarchar](max) NULL,
	[Phone] [nvarchar](50) NULL,
)

CREATE TABLE [dbo].[ACCOUNT](
    [CCCD] [nvarchar](50) NOT NULL,
    [Account_Username] [varchar](50) NOT NULL,
    [Account_Password] [varchar](50) NOT NULL,
    [Privilege] [int] NOT NULL,
	[Da_Xoa] [bit] NOT NULL
)

CREATE TABLE [dbo].[STAFFS](
	[ID_Staffs] [int] IDENTITY(1,1) NOT NULL PRIMARY KEY,
    [CCCD] [nvarchar](50) NOT NULL
)

CREATE TABLE [dbo].[CHUHO](
	[ID_Chuho] [int] IDENTITY(1,1) NOT NULL PRIMARY KEY,
    [CCCD] [nvarchar](50) NOT NULL,
	[ID_Staff] [int] NULL
)

CREATE TABLE [dbo].[E_METER](
    [ID_E_METER] [nvarchar](50) NOT NULL,
    [ID_Chuho] [int] NOT NULL,
	[DiaChi] [nvarchar](max) NOT NULL,
    [Type_Living] [nvarchar](20) NOT NULL
);

CREATE TABLE [dbo].[INVOICES](
	[Id] [int] IDENTITY(1,1) NOT NULL PRIMARY KEY,
	[ID_Staff] [int] NOT NULL,
	[ID_Chuho] [int] NOT NULL,
	[Id_E_Meter] [nvarchar](50) NOT NULL,
	[Invoice_Date] [date] NOT NULL,
	[Invoice_PayMethod] [nvarchar](50) NOT NULL,
	[Invoice_Status] [bit] NOT NULL,
	[Start_Num] [float] NOT NULL,
	[End_Num] [float] NOT NULL,
	[Total_Price] [Money] NOT NULL
)